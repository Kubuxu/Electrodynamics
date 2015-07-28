package com.calclavia.edx.mechanical.mech.gear

import java.util.Optional

import com.calclavia.edx.core.prefab.BlockEDX
import com.calclavia.edx.mechanical.MechanicContent
import nova.core.block.Block.{RightClickEvent, PlaceEvent}
import nova.core.component.renderer.{StaticRenderer, ItemRenderer}
import nova.core.network.{Packet, Syncable, Sync}
import nova.core.render.model.{StaticCubeTextureCoordinates, BlockModelUtil, Model}
import nova.core.retention.{Store, Storable}
import nova.core.util.Direction
import nova.core.util.math.{Vector3DUtil, RotationUtil}
import nova.core.util.shape.Cuboid
import nova.microblock.micro.{MicroblockContainer, Microblock}
import nova.scala.wrapper.FunctionalWrapper._
import org.apache.commons.math3.geometry.euclidean.threed.{Vector3D, Rotation}


object BlockGear {
	val thickness = 2 / 16d
	val occlusionBounds = Array.ofDim[Cuboid](6)
	val models = Array.ofDim[Model](6)

	{
		val oneByRoot2 = 1 / Math.sqrt(2)
		val center = new Cuboid(0, 0, 0, 1, thickness, 1) - 0.5

		for (s <- 0 until 6) {
			val bySideRotation = s match {
				case 0 => Rotation.IDENTITY
				case 1 => new Rotation(Vector3D.PLUS_I, Math.PI)
				case 2 => new Rotation(RotationUtil.DEFAULT_ORDER, Math.PI, -Math.PI / 2, 0)
				case 3 => new Rotation(Vector3D.PLUS_I, -Math.PI / 2)
				case 4 => new Rotation(Vector3DUtil.FORWARD, Math.PI / 2)
				case 5 => new Rotation(Vector3DUtil.FORWARD, - Math.PI / 2)
			}

			occlusionBounds(s) = center transform bySideRotation add 0.5

			val renderRotation = s match {
				case 0 => Rotation.IDENTITY
				case 1 => new Rotation(Vector3D.PLUS_I, Math.PI)
				case 2 => new Rotation(RotationUtil.DEFAULT_ORDER, Math.PI, -Math.PI / 2, 0)
				case 3 => new Rotation(Vector3D.PLUS_I, -Math.PI / 2)
					// For unknown reason it is reverse.
				case 4 => new Rotation(Vector3DUtil.FORWARD, - Math.PI / 2)
				case 5 => new Rotation(Vector3DUtil.FORWARD, Math.PI / 2)
			}

			val model = new Model(s"Side $s")
			BlockModelUtil.drawCube(model, center, StaticCubeTextureCoordinates.instance)
			model.matrix rotate renderRotation
			model.matrix rotate new Rotation(Vector3D.PLUS_J, Math.PI / 4)
			model.matrix scale(oneByRoot2, 1, oneByRoot2)

			model bind MechanicContent.gearTexture


			models(s) = model

		}
	}
}

class BlockGear extends BlockEDX with Storable with Syncable{

	override def getID: String = "mechanicalGear"

	@Sync
	@Store
	var sideRaw: Byte = 0

	var isMaser: Boolean = true
	var 

	def side = Direction.fromOrdinal(sideRaw.asInstanceOf[Int])

	private[this] val microblock = add(new Microblock(this))
		.setOnPlace(
			(evt: PlaceEvent) => {
				this.sideRaw = evt.side.opposite.ordinal.asInstanceOf[Byte]
				Optional.of(MicroblockContainer.sidePosition(this.side))
			}
		)

	private[this] val blockRenderer = add(new StaticRenderer(this))
	blockRenderer.setOnRender((model: Model) => {
		model.addChild(BlockGear.models(sideRaw))
	})

	collider.setBoundingBox(() => {
		BlockGear.occlusionBounds(sideRaw)
	})
	collider.isCube(false)
	collider.isOpaqueCube(false)

	private[this] val itemRenderer = add(new ItemRenderer(this))

	itemRenderer.onRender = (model: Model) => {
		model.addChild(BlockGear.models(3))
	}

	this.events.on(classOf[RightClickEvent]).bind((event: RightClickEvent) => {

	})

	override def read(packet: Packet): Unit = {
		super[Syncable].read(packet)
		world markStaticRender position
	}

}


package com.calclavia.edx.mechanical.mech.gearshaft

import java.util.Optional

import com.calclavia.edx.core.prefab.BlockEDX
import com.calclavia.edx.mechanical.MechanicContent
import nova.core.block.Block.PlaceEvent
import nova.core.block.component.StaticBlockRenderer
import nova.core.component.renderer.{ItemRenderer, StaticRenderer}
import nova.core.network.{Sync, Packet, Syncable}
import nova.core.retention.{Store, Storable}
import nova.core.util.Direction
import nova.core.util.math.Vector3DUtil
import nova.core.util.shape.Cuboid
import nova.microblock.micro.{MicroblockContainer, Microblock}
import nova.microblock.multi.Multiblock
import org.apache.commons.math3.geometry.euclidean.threed.{Vector3D, Rotation}
import nova.scala.wrapper.FunctionalWrapper._
import nova.scala.wrapper.VectorWrapper._

object BlockGearshaft {
	val thickness = 2 / 16d
	def occlusionBounds = {
		val center = {
			val tmp = new Cuboid(0, 0, 2/8d, thickness, thickness, 5/8d)
			tmp - tmp.center
		}

		val array = for (dir <- Direction.DIRECTIONS if dir.ordinal() % 2 == 0) yield {
			val rotation = dir match {
				case Direction.DOWN => new Rotation(Vector3D.MINUS_I, Math.PI / 2)
				case Direction.NORTH => Rotation.IDENTITY
				case Direction.WEST => new Rotation(Vector3D.MINUS_J, Math.PI / 2)

				case _ => throw new IllegalStateException()// should not happen
			}
			(dir, center transform rotation add 0.5)
		}

		array.toMap
	}

	def normalizeDir(dir: Direction) = Direction.fromOrdinal(dir.ordinal() & 0xFE)

}


class BlockGearshaft extends BlockEDX with Storable with Syncable {
	override def getID: String = "gearshaft"

	@Sync
	@Store
	var dirRaw: Byte = 2  // For item renderer

	def dir = Direction.fromOrdinal(dirRaw.asInstanceOf[Int])
	def dir_=(direction: Direction): Unit = {
		dirRaw = BlockGearshaft.normalizeDir(direction).ordinal().asInstanceOf[Byte]
	}

	private[this] val microblock = add(new Microblock(this))
		.setOnPlace(
			(evt: PlaceEvent) => {
				this.dir = evt.side
				Optional.of(MicroblockContainer.centerPosition)
			}
		)


	private[this] val blockRenderer = add(new StaticBlockRenderer(this))
	blockRenderer.setTexture(MechanicContent.gearshaftTexture)

	collider.setBoundingBox(() => {
		BlockGearshaft.occlusionBounds(dir)
	})

	collider.isCube(false)
	collider.isOpaqueCube(false)

	add(new ItemRenderer(this))

	override def read(packet: Packet): Unit = {
		super[Syncable].read(packet)
		world markStaticRender position
	}
}

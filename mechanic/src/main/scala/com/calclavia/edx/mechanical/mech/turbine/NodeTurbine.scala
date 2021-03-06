package com.calclavia.edx.mechanical.mech.turbine

import com.calclavia.edx.mechanical.mech.grid.MechanicalComponent
import edx.core.interfaces.TNodeMechanical
import net.minecraftforge.common.util.ForgeDirection

/**
 * Turbine's Mechanical node
 * Turbines always face forward and connect from behind.
 *
 * @author Calclavia, Darkguardsman
 */
class NodeTurbine(parent: TileTurbine) extends MechanicalComponent(parent)
{

  /**
   * The mechanical load
   * @return Torque in Newton meters per second
   */
  override def inertia = 100 * parent.multiBlockRadius * parent.multiBlockRadius

  /**
   * Friction is a factor that decelerates the mechanical system based on angular velocity.
   */
  override def friction: Double = 3

  /**
   * Moment of inertia = m * r * r
   * Where "m" is the mass and "r" is the radius of the object.
   */
  override def radius(other: TNodeMechanical): Double =
  {
    val deltaPos = other.asInstanceOf[MechanicalComponent].position - position

    if (deltaPos.normalize.toForgeDirection == parent.getDirection)
      return super.radius(other)

    return parent.multiBlockRadius
  }

  override def canConnect[B <: MechanicalComponent](other: B, from: ForgeDirection): Boolean =
  {
    return turbine.getMultiBlock.isPrimary && other.isInstanceOf[MechanicalComponent] && !other.isInstanceOf[NodeTurbine] && canConnect(from)
  }

  override def canConnect(from: ForgeDirection) = from == turbine.getDirection

  def turbine: TileTurbine = getParent.asInstanceOf[TileTurbine]
}
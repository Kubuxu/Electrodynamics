package com.calclavia.edx.optics.api.machine;

import com.calclavia.edx.optics.api.Frequency;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;

import java.util.Set;

/**
 * Also extends IDisableable, IFortronFrequency
 * @author Calclavia
 */
public interface Projector extends FieldMatrix, Frequency {
	/**
	 * Projects the force field.
	 */
	void projectField();

	/**
	 * Destroys the force field.
	 */
	void destroyField();

	/**
	 * @return The speed in which a force field is constructed.
	 */
	int getProjectionSpeed();

	/**
	 * DO NOT modify this list. Read-only.
	 * @return The actual force field block coordinates in the world.
	 */
	Set<Vector3D> getForceFields();

	/**
	 * Checks if this specific position is in the field.
	 * @param pos World position
	 * @return True if so
	 */
	boolean isInField(Vector3D pos);
}
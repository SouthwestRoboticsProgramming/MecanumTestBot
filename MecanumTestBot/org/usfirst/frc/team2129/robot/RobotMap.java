/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2129.robot;

import org.usfirst.frc.team2129.util.motordesc.CANMotorDescriptor;
import org.usfirst.frc.team2129.util.motordesc.MotorDescriptor;
import org.usfirst.frc.team2129.util.motordesc.PWMMotorDescriptor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static MotorDescriptor frontRight    = new PWMMotorDescriptor(2);
	public static MotorDescriptor frontLeft     = new PWMMotorDescriptor(1);
	public static MotorDescriptor backLeft      = new CANMotorDescriptor(5);
	public static MotorDescriptor backRight     = new PWMMotorDescriptor(0, true);
	
	public static MotorDescriptor leftArmMotor  = new CANMotorDescriptor(6);
	public static MotorDescriptor rightArmMotor = new PWMMotorDescriptor(3, true);
}

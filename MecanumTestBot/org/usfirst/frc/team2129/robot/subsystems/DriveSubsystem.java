/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2129.robot.subsystems;

import org.usfirst.frc.team2129.robot.RobotMap;
import org.usfirst.frc.team2129.robot.commands.UserDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
	
	private SpeedController frontRight = RobotMap.frontRight.get();
	private SpeedController frontLeft  = RobotMap.frontLeft .get();
	private SpeedController backRight  = RobotMap.backRight .get();
	private SpeedController backLeft   = RobotMap.backLeft  .get();
	private RobotDrive      drive      = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	
	
	public void initDefaultCommand() {
		 setDefaultCommand(new UserDriveCommand());
	}
	
	public void drive(double x, double y, double t) {
		drive.mecanumDrive_Cartesian(x, -y, t, 0);
//		frontLeft.set(x);
//		frontRight.set(x);
//		backLeft.set(x);
//		backRight.set(x);
	}
}

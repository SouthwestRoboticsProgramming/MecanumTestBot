/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2129.robot;

import org.usfirst.frc.team2129.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team2129.robot.subsystems.IntakeSubsystem;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public static final DriveSubsystem s_DriveSubsystem = new DriveSubsystem();
	public static final IntakeSubsystem s_IntakeSubsystem = new IntakeSubsystem();

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}
	
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
	}
}

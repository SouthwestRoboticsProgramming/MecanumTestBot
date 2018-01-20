package org.usfirst.frc.team2129.robot.subsystems;

import org.usfirst.frc.team2129.robot.RobotMap;
import org.usfirst.frc.team2129.robot.commands.UserArmCommand;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeSubsystem extends Subsystem {
	private SpeedController leftWheel = RobotMap.leftArmMotor.get();
	private SpeedController rightWheel = RobotMap.rightArmMotor.get();
	
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new UserArmCommand());
	}

	public void setIntakes(double d) {
		// TODO Auto-generated method stub
		leftWheel.set(d);
		rightWheel.set(-d);
	}

}

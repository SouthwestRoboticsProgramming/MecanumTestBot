package org.usfirst.frc.team2129.robot.commands;

import org.usfirst.frc.team2129.robot.OI;
import org.usfirst.frc.team2129.robot.Robot;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.command.Command;

public class UserArmCommand extends Command {
	
	public UserArmCommand() {
		requires(Robot.s_IntakeSubsystem);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute() {
		Robot.s_IntakeSubsystem.setIntakes(OI.joy.getRawButton(1)?OI.joy.getThrottle():0);
	}

}

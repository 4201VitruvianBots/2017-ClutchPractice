package org.usfirst.frc.team4201.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4201.robot.Robot;

/**
 *
 */
public class SetDriveLowGear extends Command {
	public SetDriveLowGear() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		if(Robot.driveTrain.getShiftStatus() != DoubleSolenoid.Value.kReverse)
			Robot.driveTrain.setLowGear();
		else if(Robot.driveTrain.getShiftStatus() != DoubleSolenoid.Value.kForward)
			Robot.driveTrain.setHighGear();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.DriveTrainComm;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MothSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveTrainComm());
    }
    
    public void Drive(double speed, double rotation) {
    	RobotMap.diffDrive.arcadeDrive(speed, rotation);
    }
    
    public void DriveStick() {
    	Drive(Robot.m_oi.jStick.getRawAxis(0), Robot.m_oi.jStick.getRawAxis(1));
    }
}


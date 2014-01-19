package edu.wpi.first.wpilibj.templates;

import drivetrain.Drivetrain;
import drivetrain.MonitoredGearbox;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class RobotTemplate extends IterativeRobot {

    Drivetrain drivetrain;
    MonitoredGearbox leftGearbox, rightGearbox;
    Joystick leftJoystick, rightJoystick;

    public void robotInit() {
        leftGearbox = new MonitoredGearbox(Vars.DriveTrain.leftFrontTalonPort, Vars.DriveTrain.leftRearTalonPort, new Encoder(Vars.DriveTrain.leftEncoder1, Vars.DriveTrain.leftEncoder2));
        rightGearbox = new MonitoredGearbox(Vars.DriveTrain.rightFrontTalonPort, Vars.DriveTrain.rightRearTalonPort, new Encoder(Vars.DriveTrain.rightEncoder1, Vars.DriveTrain.rightEncoder2));
        drivetrain = new Drivetrain(leftGearbox, rightGearbox);
        leftJoystick = new Joystick(1);
        rightJoystick = new Joystick(2);
    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        //double joystick
        drivetrain.twoJoystickDrive(leftJoystick.getY(), rightJoystick.getY());
        
        //arcade
//        drivetrain.arcade(leftJoystick.getY(), leftJoystick.getX());
        
        //tank
//        if (leftJoystick.getTrigger()) {
//            drivetrain.rotate(leftJoystick.getX());
//        }
//        else {
//            drivetrain.straight(leftJoystick.getY());
//        }
    }
    
    public void testPeriodic() {

    }

}

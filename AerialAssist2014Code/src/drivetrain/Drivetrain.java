package drivetrain;

/**
 *
 * @author asaf
 */
public class Drivetrain {
    
    public Drivetrain(MonitoredGearbox leftGearbox, MonitoredGearbox rightGearbox);
    
    public void straight(double speed);
    
    public void rotate(double speed);
    
    public void arcade(double angularSpeed, double speed);
    
    public void stop();
    
    public void twoJoystickDrive(double leftSpeed, double rightSpeed);
    
    public void setLeftSpeed(double speed);
    
    public void setRightSpeed(double speed);
}
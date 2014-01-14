package drivetrain;

/**
 *
 * @author asaf
 */
public class Drivetrain {
    private MonitoredGearbox leftGearbox, rightGearbox;
    
    public Drivetrain(MonitoredGearbox leftGearbox, MonitoredGearbox rightGearbox) {
        this.leftGearbox = leftGearbox;
        this.rightGearbox = rightGearbox;
    }
    
    public void straight(double speed) {
        setLeftSpeed(speed);
        setRightSpeed(speed);
    }
    
    public void rotate(double speed) {
        setLeftSpeed(speed);
        setRightSpeed(-speed);
    }
    
    public void arcade(double angularSpeed, double speed) {
        
    }
    
    public void stop() {
        straight(0);
    }
    
    public void twoJoystickDrive(double leftSpeed, double rightSpeed) {
        setLeftSpeed(leftSpeed);
        setRightSpeed(rightSpeed);
    }
    
    public void setLeftSpeed(double speed) {
        leftGearbox.set(speed);
    }
    
    public void setRightSpeed(double speed) {
        rightGearbox.set(-speed);
    }
}
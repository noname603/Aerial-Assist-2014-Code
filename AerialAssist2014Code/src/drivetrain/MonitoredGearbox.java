package drivetrain;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author asaf
 */
public class MonitoredGearbox extends Gearbox {
    
    public MonitoredGearbox(int channel1, int channel2, Encoder encoder);
    
    public MonitoredGearbox(SpeedController sc1, SpeedController sc2, Encoder encoder);
    
    public MonitoredGearbox(int channel1, int channel2, int channel3, Encoder encoder);
    
    public MonitoredGearbox(SpeedController sc1, SpeedController sc2, SpeedController sc3, Encoder encoder);
    
    public double getDistance();
    
    public double getAngle();
    
    public double getVelocity();
    
    public double getAngularVelocity();
    
    public void startEncoders();
    
    public void stopEncoders();
    
    public void resetEncoders();
}
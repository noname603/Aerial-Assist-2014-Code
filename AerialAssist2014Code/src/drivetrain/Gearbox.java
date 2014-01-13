package drivetrain;

import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author asaf
 */
public class Gearbox implements SpeedController {
    
    public Gearbox(int channel1, int channel2);
    
    public Gearbox(SpeedController sc1, SpeedController sc2);
    
    public Gearbox(int channel1, int channel2, int channel3);
    
    public Gearbox(SpeedController sc1, SpeedController sc2, SpeedController sc3);
    
    public void setSpeed(double speed);
    
    public double getSpeed();
    
    public void stop();
}
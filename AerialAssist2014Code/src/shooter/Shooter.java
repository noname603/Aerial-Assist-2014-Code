package shooter;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author asaf
 */
public class Shooter {
    
    public Shooter(SpeedController springLoader, SpeedController hookMotor, SpeedController railAngleSetter, Encoder springLoaderEncoder, DigitalInput ledgeDownTouchSensor, Encoder railAngleSetterEncoder);
    
    public void stretchSpringToForce(double force);
    
    public void shoot();
    
    public void reset();
    
    public void hookGrapple();
    
    public void setRailAngle(double angle);
    
    public double getRailAngle();
    
    public double getStretchForce();
    
    public boolean isLedgeDown();
    
    public boolean isHookOn();
}
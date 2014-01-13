package rollers;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author asaf
 */
public class Roller {
    
    public Roller(CANJaguar rollerMotor, SpeedController foldingMotor, DigitalInput openTouchSensor, DigitalInput closeTouchSensor, DigitalInput ballInTouchSensor);
    
    public double getVoltage();
    
    public void setVoltage(double voltage);
    
    public void stop();
    
    public void takeIn();
    
    public void load();
    
    public boolean isHoldingBall();
    
    public void fold();
    
    public void unfold();
    
    public boolean isFolded();
    
    public boolean isUnfolded();
}
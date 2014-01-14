package drivetrain;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author alon & roni && ETHAN RULES!!
 */
public class MonitoredGearbox extends Gearbox {
    
    private Encoder encoder;
    
    public MonitoredGearbox(int frontChannel,int rearChannel, Encoder encoder) {
        super(frontChannel,rearChannel);
        setEncoder(encoder);
    }
    
    public MonitoredGearbox(SpeedController front, SpeedController rear, Encoder encoder) {
        super(front,rear);
        setEncoder(encoder);
    }
    
    public MonitoredGearbox(int frontChannel, int rearChannel, int midChannel, Encoder encoder) {
        super(frontChannel,rearChannel,midChannel);
        setEncoder(encoder);
    }
    
    public MonitoredGearbox(SpeedController front, SpeedController mid, SpeedController rear, Encoder encoder) {
        super(front,mid,rear);
        setEncoder(encoder);
    }
    
    public double getDistance() {
        return encoder.getDistance();
    }
    
    public double getAngle() {
        return getDistance() / getAngularVelocity();
    }
    
    public double getVelocity() {
        return get();
    }
     
    public double getAngularVelocity() {
        return encoder.getRate();
    }
    
    public void startEncoders() {
        encoder.start();
    }
    
    public void stopEncoders() {
        encoder.stop();
    }
    
    public void resetEncoders() {
        encoder.reset();
    }
    
    private void setEncoder(Encoder encoder) {
        this.encoder = encoder;
    }
}
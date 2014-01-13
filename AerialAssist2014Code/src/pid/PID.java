package pid;

/**
 *
 * @author asaf
 */
public class PID implements Runnable {
    
    public PID(PIDIn input, PIDOut output, double kP, double kI, double kD, double dt, double tolerance);
    
    public void run();
    
    public void stop();
    
    public void reset();
    
    public void setTarget();
    
    public boolean isRunning();
    
    public boolean hasArrived();
}
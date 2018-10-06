package gov.dod.missile;

/**
 * Created by uengine on 2018. 9. 28..
 */
public class Missile {

    boolean outOfRange;
    boolean burnedOut;
    double xLocation;
    double yLocation;
    double zLocation;


    public double getxLocation() {
        return xLocation;
    }

    public void setxLocation(double xLocation) {
        this.xLocation = xLocation;
    }

    public double getyLocation() {
        return yLocation;
    }

    public void setyLocation(double yLocation) {
        this.yLocation = yLocation;
    }

    public double getzLocation() {
        return zLocation;
    }

    public void setzLocation(double zLocation) {
        this.zLocation = zLocation;
    }

    public boolean isOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(boolean outOfRange) {
        this.outOfRange = outOfRange;
    }

    public boolean isBurnedOut() {
        return burnedOut;
    }

    public void setBurnedOut(boolean burnedOut) {
        this.burnedOut = burnedOut;
    }


}

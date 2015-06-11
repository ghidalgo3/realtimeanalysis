package simulator;

/**
 * Used for keeping track of time for events and simulation
 *
 * Created by Gustavo on 2/16/15.
 */
public class Time {

    private double time;

    public Time(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public Time add(double moreTime) {
        time += moreTime;
        return this;
    }

    @Override
    public String toString() {
        return String.format("time=%4.3fs", time);
    }
}

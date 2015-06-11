package fr.ensma.realtimescheduling.simulator;

/**
 * Used for keeping track of time for events and simulation
 *
 * Created by Gustavo on 2/16/15.
 */
public class Time {

    public final double time;

    public Time(double time) {
        this.time = time;
    }

    public Time add(double moreTime) {
        return new Time(time + moreTime);
    }

    @Override
    public String toString() {
        return String.format("time=%4.3fs", time);
    }
}

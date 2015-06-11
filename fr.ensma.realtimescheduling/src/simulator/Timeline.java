package simulator;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Maintains the PrioirtyQueue of all events
 * in the simulation
 */
public class Timeline {

    private static class TimedEvent implements Comparable<TimedEvent>{

        public final Event event;
        public final Time t;

        public TimedEvent(Event event, Time t) {
            this.event = event;
            this.t = t;
        }

        @Override
        public int compareTo(TimedEvent o) {
            return this.t.getTime() > o.t.getTime() ? 1
                    : this.t.getTime() < o.t.getTime() ? -1 : 0;
        }
    }

    private static double currentTime;
    private static Queue<TimedEvent> queue = new PriorityQueue<TimedEvent>();

    /**
     * Add event e to execute at time t
     */
    public static void enqueue(Event e, Time t) {
        TimedEvent te = new TimedEvent(e, t);
        queue.add(te);
    }

    /**
     * Dequeue the next event
     */
    public static Event dequeue() {
        TimedEvent te = queue.poll();
        currentTime = te.t.getTime();
        return te.event;
    }

    public static void reset() {
    	currentTime = 0;
    }
    
    public static boolean isEmpty() {
        return queue.isEmpty();
    }

    public static Time getCurrentTime() {
        return new Time(currentTime);
    }
}
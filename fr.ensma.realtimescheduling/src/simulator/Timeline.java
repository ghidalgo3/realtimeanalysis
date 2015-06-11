package simulator;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Maintains the PrioirtyQueue of all events
 * in the simulation
 */
public class Timeline {

    private class TimedEvent implements Comparable<TimedEvent>{

        public final Event event;
        public final Time t;

        public TimedEvent(Event event, Time t) {
            this.event = event;
            this.t = t;
        }

        @Override
        public int compareTo(TimedEvent o) {
            return this.t.time > o.t.time ? 1
                    : this.t.time < o.t.time ? -1 : 0;
        }
    }

    private double currentTime;
    private Queue<TimedEvent> queue = new PriorityQueue<TimedEvent>();

    /**
     * Add event e to execute at time t
     */
    public void enqueue(Event e, Time t) {
        TimedEvent te = new TimedEvent(e, t);
        queue.add(te);
    }

    /**
     * Dequeue the next event
     */
    public Event dequeue() {
        TimedEvent te = queue.poll();
        currentTime = te.t.time;
        return te.event;
    }

    public void reset() {
    	queue.clear();
    	currentTime = 0;
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Time getCurrentTime() {
        return new Time(currentTime);
    }
}
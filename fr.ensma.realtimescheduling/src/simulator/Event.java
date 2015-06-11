package simulator;

/**
 * A discrete time event.
 * Created by Gustavo on 2/16/15.
 */
@FunctionalInterface
public interface Event {
	
	/**
	 * Executes the event.
	 */
    void execute();
}

package simulator;

import java.util.Random;

/**
 * Created by Gustavo on 2/16/15.
 */
public class Distribution {

    private static Random r = new Random();

    public static double uniform() {
        return r.nextDouble();
    }
    
    public static int uniformInt(int range) {
    	return r.nextInt(range);
    }

    /**
     * Remember that the mean of the exponential distribution is 1/lambda so
     * lambda represents the rate of the distribution.
     * @param lambda process rate
     * @return random variable sampled from that distribution
     */
    public static double exponential(double lambda) {
        return -lambda * Math.log(1 - r.nextDouble());
    }
}

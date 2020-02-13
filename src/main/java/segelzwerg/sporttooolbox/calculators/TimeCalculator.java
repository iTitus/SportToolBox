package segelzwerg.sporttooolbox.calculators;

import lombok.EqualsAndHashCode;
import segelzwerg.sporttooolbox.iunits.Distance;
import segelzwerg.sporttooolbox.iunits.Time;
import segelzwerg.sporttooolbox.iunits.speed.Speed;

@EqualsAndHashCode
public class TimeCalculator {
    private final Distance distance;
    private final Speed speed;

    /**
     * constructor
     *
     * @param distance {@link Distance}
     * @param speed    {@link Speed}
     */
    public TimeCalculator(Distance distance, Speed speed) {

        this.distance = distance;
        this.speed = speed;
    }

    /**
     * calculates the time for a given distance and speed
     *
     * @return {@link Time}
     */
    public Time computeTime() {
        return distance.computeTime(speed);
    }
}
package segelzwerg.sporttooolbox.iunits.distance;

import org.assertj.core.util.FloatComparator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NauticalTest {

    private final FloatComparator fathomComparator = new FloatComparator(0.001f);

    @Test
    public void constructorTest() {
        Nautical nautical = new Nautical(1);

        Nautical expectedNautical = new Nautical(1, 0);

        assertThat(nautical).isEqualToComparingFieldByField(expectedNautical);
    }

    @Test
    public void overflowTest() {
        Nautical nautical = new Nautical(0, 1013);

        Distance expectedDistance = new Nautical(1, 0.31409f);

        assertThat(nautical).usingComparatorForFields(fathomComparator, "fathoms").isEqualToComparingFieldByField(expectedDistance);
        assertThat(nautical).isEqualToIgnoringGivenFields(expectedDistance, "fathoms");
    }
}
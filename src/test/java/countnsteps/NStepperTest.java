package countnsteps;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NStepperTest {

    @Test
    public void test_GetIntervals() {
        assertEquals(Arrays.<Integer>asList(0, 2, 4, 6, 8, 10), NStepper.getIntervals(2, 10));

        assertEquals(Arrays.<Integer>asList(0, 3, 6, 9), NStepper.getIntervals(3, 10));

        assertEquals(Arrays.<Integer>asList(0, 1, 2, 3, 4, 5), NStepper.getIntervals(1, 5));
    }
}
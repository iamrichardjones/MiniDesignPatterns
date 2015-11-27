package countnsteps;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NStepperTest {

    @Test
    public void test_GetIntervals() {
        assertEquals(Arrays.asList(0, 2, 4, 6, 8, 10), NStepper.counter(2, 10));

        assertEquals(Arrays.asList(0, 3, 6, 9), NStepper.counter(3, 10));

        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5), NStepper.counter(1, 5));
    }
}
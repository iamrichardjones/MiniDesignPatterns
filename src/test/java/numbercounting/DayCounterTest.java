package numbercounting;

import org.junit.Test;
import static org.junit.Assert.*;

public class DayCounterTest {

    @Test
    public void test_Count() {
        assertEquals(31, DayCounter.getTotal(1));
        assertEquals(59, DayCounter.getTotal(2));
        assertEquals(365, DayCounter.getTotal(12));
    }

}

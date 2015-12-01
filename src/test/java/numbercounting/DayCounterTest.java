package numbercounting;

import org.junit.Test;
import static org.junit.Assert.*;

public class DayCounterTest {

    @Test
    public void test_Count() {
        assertEquals("Jan (31)", 31, DayCounter.getTotal(1));
        assertEquals("Jan (31) + Feb (28)", 59, DayCounter.getTotal(2));
        assertEquals("Jan (31) + Feb (28) + Mar  (31)+ Apr (30) + May (31) + Jun (30) + " +
                     "Jul (31) + Aug (31) + Sep (30) + Oct + Nov (30) + Dec (31)",
                365, DayCounter.getTotal(12));
    }

    //see ExceptionHandling package
    @Test(expected = IllegalArgumentException.class)
    public void test_Count_EdgeCases_Lower() {
        DayCounter.getTotal(0);
    }

    //see ExceptionHandling package
    @Test(expected = IllegalArgumentException.class)
    public void test_Count_EdgeCases_Higher() {
        DayCounter.getTotal(13);
    }
}

package exceptioncleanup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CleanExceptionTest {

    @Test
    public void test_NoException() {
        CleanException ce = new CleanException();
        ce.throwException(10, false);
        assertEquals(new Integer(10), ce.getValue());
    }

    @Test
    public void test_ExceptionThrownButCheckValueAssigned() {
        CleanException ce = new CleanException();
        try {
            ce.throwException(42, true);
            fail("Exception should be thrown");
        }
        catch (RuntimeException expected) {
            assertEquals("Throwing Exception", expected.getMessage());
            assertEquals(new Integer(42), ce.getValue());
        }
    }
}
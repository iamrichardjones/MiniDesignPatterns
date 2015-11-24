package exceptionhandling;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionalPersonTest {

    @Test
    public void test_ThrowsExceptionIfNullInput() {
        try {
            new ExceptionalPerson(null);
            fail("Exception should be thrown with null input");
        }
        catch (IllegalArgumentException iae) {
            assertEquals(NullPointerException.class.getName(), iae.getCause().getClass().getName());
        }
    }

    @Test
    public void test_DoesNotThrowsExceptionIfNonNullInput() {
        new ExceptionalPerson("");
        new ExceptionalPerson("Richard");
    }
}

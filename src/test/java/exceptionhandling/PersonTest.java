package exceptionhandling;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test_ThrowsException() {
        try {
        new Person(null);
            fail();
        }
        catch (IllegalArgumentException iae) {
            assertEquals(NullPointerException.class.getName(), iae.getCause().getClass().getName());
        }
    }
}

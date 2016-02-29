package equalsorequals;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualsOrEqualsOrTest {

    @Test
    public void testFindsSuccessfully() {
        assertTrue(EqualsOrEqualsOr.matches("one", "one", "two", "three"));
        assertTrue(EqualsOrEqualsOr.matches("two", "one", "two", "three"));
        assertTrue(EqualsOrEqualsOr.matches("three", "one", "two", "three"));
    }

    @Test
    public void testFindUnsuccessfully() {
        assertFalse(EqualsOrEqualsOr.matches("four", "one", "two", "three"));
    }
}
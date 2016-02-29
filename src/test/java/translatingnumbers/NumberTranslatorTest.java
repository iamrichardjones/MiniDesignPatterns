package translatingnumbers;

import equalsorequals.EqualsOrEqualsOr;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTranslatorTest {

    @Test
    public void test_AllWorks() {
        assertEquals("one", NumberTranslator.convertDigitToText(1));
        assertEquals("two", NumberTranslator.convertDigitToText(2));
        assertEquals("three", NumberTranslator.convertDigitToText(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_OutOfBounds_Lower() {
        NumberTranslator.convertDigitToText(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_OutOfBounds_Upper() {
        NumberTranslator.convertDigitToText(4);
    }


    public void testFindUnsuccessfully() {
        EqualsOrEqualsOr.matches("four", "one", "two", "three");
    }
}
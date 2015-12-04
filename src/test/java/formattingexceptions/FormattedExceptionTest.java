package formattingexceptions;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormattedExceptionTest {

    @Test
    public void test_Format() {
        FormattedException e = new FormattedException("msg %s", "abc");
        assertEquals("msg abc", e.getMessage());
    }

    @Test
    public void test_No_Format() {
        FormattedException e = new FormattedException("abc");
        assertEquals("abc", e.getMessage());
    }


}
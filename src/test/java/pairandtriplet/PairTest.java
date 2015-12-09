package pairandtriplet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairTest {

    @Test
    public void test_Pair() {
        Pair<String, Integer> pair = new Pair<String, Integer>("a", 1);
        assertEquals("java.lang.String", pair.getOne().getClass().getName());
        assertEquals("java.lang.Integer", pair.getTwo().getClass().getName());
        assertEquals("a", pair.getOne());
        assertEquals(new Integer(1), pair.getTwo());
        assertEquals("a", pair.one);
        assertEquals(new Integer(1), pair.two);
    }
}
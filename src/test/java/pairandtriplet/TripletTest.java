package pairandtriplet;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class TripletTest {

    @Test
    public void test_Pair() {
        Triplet<String, Integer, File> pair = new Triplet<String, Integer, File>("a", 1, new File("/a/b"));

        assertEquals("java.lang.String", pair.getOne().getClass().getName());
        assertEquals("java.lang.Integer", pair.getTwo().getClass().getName());
        assertEquals("java.io.File", pair.getThree().getClass().getName());

        assertEquals("a", pair.getOne());
        assertEquals(new Integer(1), pair.getTwo());
        assertEquals(new File("/a/b"), pair.getThree());

        assertEquals("a", pair.one);
        assertEquals(new Integer(1), pair.two);
        assertEquals(new File("/a/b"), pair.three);
    }
}
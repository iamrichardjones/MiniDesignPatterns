package instantiating;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HashMapInstantiatorTest {

    @Test
    public void test_GetHashMap() {
        Map<Integer, String> instantiatedHashMap = HashMapInstantiator.getInstantiatedHashMap();
        assertEquals(3, instantiatedHashMap.size());
        assertEquals(new HashSet<Integer>(Arrays.<Integer>asList(1, 2, 3)), instantiatedHashMap.keySet());
        Collection<String> values = instantiatedHashMap.values();
        Iterator<String> iterator = values.iterator();
        assertEquals("one", iterator.next());
        assertEquals("two", iterator.next());
        assertEquals("three", iterator.next());
        assertFalse(iterator.hasNext());
    }
}
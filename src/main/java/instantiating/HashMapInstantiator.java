package instantiating;

import java.util.HashMap;
import java.util.Map;

/**
 * Google Guava has a very nice ArrayList class that allow you to instantiate the
 * <a href="http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/collect/Lists.html#newArrayList(E...)">ArrayList</a> using paramteres
 * to the constructor. This makes it very easy for the reviewer to see what is contained within the
 * ArrayList right after instantiation. There is no effort between finding the instantiation and the initialisation
 *
 * This mini-design pattern shows how you can populate a HashMap at the same time as instantiating it.
 * The code creates a subclass of HashMap (first {}) and then a code block for initialisation (second {})
 */
public class HashMapInstantiator {

    private HashMapInstantiator() { }

    public static Map<Integer, String> getInstantiatedHashMap() {
        return new HashMap<Integer, String>()
            {
                {
                    put(1, "one");
                    put(2, "two");
                    put(3, "three");
                }
            };
    }

}

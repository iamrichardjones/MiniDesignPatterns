package equalsorequals;

import java.util.Arrays;

/**
 * This mini-pattern can be used to test if a String value (or any other type) matches one of three other
 * types. In its most basic form the tests will be ((a equals b) or (a equals c) or....)
 * This is both ugly and hard to read. If the possible matches are entered into a List then the contains
 * method can be used. This assumes that the testing condition in EQUALS as that is what is used by
 * the list when it check contains
 */

public class EqualsOrEqualsOr {

    public static boolean matches(String toFind, String possibleMatch1, String possibleMatch2, String possibleMatch3) {
        return Arrays.asList(possibleMatch1, possibleMatch2, possibleMatch3).contains(toFind);
    }

}

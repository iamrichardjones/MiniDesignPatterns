package exceptioncleanup;

/**
 * Here we have a class that assigns a value then throws an exception. The mini-pattern is best seen in
 * the unit test. Here we verify that an exception is thrown but ensure that we check the values that
 * are left over after this exception. It is possible for the caller to catch the exception and still use
 * the object that is instantiated. Therefore we should always test for this.
 */
public class CleanException {

    private Integer value;

    public void throwException(Integer value, Boolean throwException) {
        this.value = value;
        if (throwException) {
            throw new RuntimeException("Throwing Exception");
        }
    }

    public Integer getValue() {
        return value;
    }
}

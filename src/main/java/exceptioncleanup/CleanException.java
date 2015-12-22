package exceptioncleanup;

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

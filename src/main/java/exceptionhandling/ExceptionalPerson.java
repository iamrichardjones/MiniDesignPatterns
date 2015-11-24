package exceptionhandling;

/**
 * It can be very tempting for people to throw Exception (or even RuntimeException) when things go wrong.
 * You should throw and catch the appropriate exceptions.
 * Often NullPointerException is thrown when there are problems on parameters. This is not strictly correct.
 * In the example below we are throwing IllegalArgumentException because that is what is wrong. The cause is
 * a NullPointerException. It's an extra couple of lines of code but for clarity I think it is worth it
 */

public class ExceptionalPerson {

    private final String name;

    public ExceptionalPerson(String name) {
        if (name == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            iae.initCause(new NullPointerException());
            throw iae;
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }
}

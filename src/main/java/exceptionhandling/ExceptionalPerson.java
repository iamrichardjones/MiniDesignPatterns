package exceptionhandling;


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

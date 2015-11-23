package exceptionhandling;


public class Person {

    private final String name;

    public Person(String name) {
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

package equalsorequals;

public class EqualsOrEqualsOrTest {

    public void testFindsSuccessfully() {
        EqualsOrEqualsOr.matches("one", "one", "two", "three");
        EqualsOrEqualsOr.matches("two", "one", "two", "three");
        EqualsOrEqualsOr.matches("three", "one", "two", "three");
    }

    public void testFindUnsuccessfully() {
        EqualsOrEqualsOr.matches("four", "one", "two", "three");
    }
}
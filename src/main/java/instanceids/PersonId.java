package instanceids;

public class PersonId extends Identifiable {

    private PersonId(Integer id) {
        super(id , PersonId.class.getSimpleName());
    }

    public static PersonId get(Integer id) {
        return new PersonId(id);
    }
}

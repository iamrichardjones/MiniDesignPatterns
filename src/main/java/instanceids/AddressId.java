package instanceids;

public class AddressId extends Identifiable {

    private AddressId(Integer id) {
        super(id);
    }

    public static AddressId getInstance(Integer id) {
        return new AddressId(id);
    }
}
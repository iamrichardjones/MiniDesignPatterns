package instanceids;

public class AddressId extends Identifiable {

    private AddressId(Integer id) {
        super(id , AddressId.class.getSimpleName());
    }

    public static AddressId get(Integer id) {
        return new AddressId(id);
    }
}
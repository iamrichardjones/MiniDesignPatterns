package instanceids;

public class InstanceIdInputter {

    private final PersonId one;
    private final AddressId two;

    public InstanceIdInputter(PersonId one, AddressId two) {
        this.one = one;
        this.two = two;
    }

    public Integer getPersonId() {
        return one.getValue();
    }

    public Integer getAddressId() {
        return two.getValue();
    }

}

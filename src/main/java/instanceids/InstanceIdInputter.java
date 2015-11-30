package instanceids;

/**
 * This mini-design-pattern is an alternative to the Builder Pattern. Rather than constantly returning this
 * and having methods for each parameter we can use this InstanceId pattern. Unlike the builder it enforces
 * that all the parameters of the constructor are set as the coder builds the constructor. It also ensures
 * that for constructors with many parameters the instnaceid pattern makes it explicit which parameters do
 * what. Consider:
 *
 * new MyClass(1, 2, 3, 4, 5, 6)
 *
 * compared to
 *
 * new MyClass(PersonId.get(1), AddressId.get(2), GenderId.get(3), JobId.get(4), RaceId.get(5), EthnicId.get(6));
 *
 * The second is a lot more explicit for not much more code and allows the reviewer to easily see what
 * is happening
 */
public class InstanceIdInputter {

    private final PersonId pid;
    private final AddressId aid;

    public InstanceIdInputter(PersonId pid, AddressId aid) {
        this.pid = pid;
        this.aid = aid;
    }

    public Integer getPersonId() {
        return pid.getValue();
    }

    public Integer getAddressId() {
        return aid.getValue();
    }

}

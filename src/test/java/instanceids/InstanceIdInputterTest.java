package instanceids;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class InstanceIdInputterTest {

    @Test
    public void test_ValidInput() {
        InstanceIdInputter inputter = new InstanceIdInputter(PersonId.get(1), AddressId.get(2));
        assertEquals(new Integer(1), inputter.getPersonId());
        assertEquals(new Integer(2), inputter.getAddressId());
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_ThrowsExceptionIfInvalidInteger() {
        InstanceIdInputter inputter = new InstanceIdInputter(PersonId.get(0), AddressId.get(0));
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_ThrowsExceptionIfNullInput() {
        InstanceIdInputter inputter = new InstanceIdInputter(PersonId.get(null), AddressId.get(null));
    }
}
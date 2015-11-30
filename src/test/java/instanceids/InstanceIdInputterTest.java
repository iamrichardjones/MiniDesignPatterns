package instanceids;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstanceIdInputterTest {

    @Test
    public void test_ThrowsExceptionIfNullInput() {
        InstanceIdInputter inputter = new InstanceIdInputter(PersonId.get(1), AddressId.get(2));
        assertEquals(new Integer(1), inputter.getPersonId());
        assertEquals(new Integer(2), inputter.getAddressId());
    }
}
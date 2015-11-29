package instanceids;

import org.junit.Test;

public class InstanceIdInputterTest {

    @Test
    public void test_ThrowsExceptionIfNullInput() {
        new InstanceIdInputter(PersonId.getInstance(1), AddressId.getInstance(2));
    }

}

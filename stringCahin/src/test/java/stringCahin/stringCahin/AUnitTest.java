package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class AUnitTest {
    @Test
    public void testCWithStub() {
        // create stub of B
        BStub stub = new BStub();
        // create A with the stub
        A a = new A(stub);

        // call A — לא לסטאב!
        String result = a.process("");

        // validate the output
        assertEquals("HX", result);
    }
}

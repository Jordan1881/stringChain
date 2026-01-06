package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTest {
    @Test
    public void testCWithStub() {
        // create stub of C
        CStub stub = new CStub();
        // create B with the stub
        B b = new B(stub);

        // call B — לא לסטאב!
        String result = b.process("");

        // validate the output
        assertEquals("EY", result);
    }
}

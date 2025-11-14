package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class CUnitTest {
    @Test
    public void testCWithStub() {
        // create stub of D
        DStub stub = new DStub();
        // create C with the stub
        C c = new C(stub);

        // call "C" and not the stub!
        String result = c.process("HE");

        // validate the output
        assertEquals("HELX", result);
    }
}
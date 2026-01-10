package stringCahin.stringCahin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethodTest {

    @Test
    public void T1() {
        int result = Hw3Functions.weakMethod(1);
        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void T2() {
        Hw3Functions.weakMethod(0);
    }
}
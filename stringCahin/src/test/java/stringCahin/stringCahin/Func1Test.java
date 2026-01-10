package stringCahin.stringCahin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Func1Test {

    @Test
    public void T1() {
        int result = Hw3Functions.func1(1, 0, 50);
        assertEquals(5, result);
    }

    @Test
    public void T2() {
        int result = Hw3Functions.func1(1, 1, 50);
        assertEquals(0, result);
    }

    @Test(expected = ArithmeticException.class)
    public void T3() {
        Hw3Functions.func1(0, 1, 50);
    }
}

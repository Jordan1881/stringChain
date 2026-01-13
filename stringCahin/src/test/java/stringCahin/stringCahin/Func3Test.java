package stringCahin.stringCahin;

import org.junit.Test;

public class Func3Test {

    @Test(expected = ArithmeticException.class)
    public void T1_xGreaterThanZero() {
        Hw3Functions.func3(2);
    }

    @Test(expected = ArithmeticException.class)
    public void T2_xEqualsZero() {
        Hw3Functions.func3(0);
    }
}
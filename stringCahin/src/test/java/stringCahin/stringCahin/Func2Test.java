package stringCahin.stringCahin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Func2Test {

    @Test
    public void T1() {
        int result = Hw3Functions.func2(1, 20);
        assertEquals(20, result);
    }

    @Test
    public void T2() {
        int result = Hw3Functions.func2(0, 20);
        assertEquals(0, result);
    }
}
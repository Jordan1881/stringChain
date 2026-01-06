package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinCalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void a_min_minus_1() {
        MinCalculator.findMin(0, 50, 50, 50, 50);
    }

    @Test
    public void a_min() {
        assertEquals(1, MinCalculator.findMin(1, 50, 50, 50, 50));
    }

    @Test
    public void a_min_plus_1() {
        assertEquals(2, MinCalculator.findMin(2, 50, 50, 50, 50));
    }

    @Test
    public void a_max_minus_1() {
        assertEquals(50, MinCalculator.findMin(999, 50, 50, 50, 50));
    }

    @Test
    public void a_max() {
        assertEquals(50, MinCalculator.findMin(1000, 50, 50, 50, 50));
    }

    @Test(expected = IllegalArgumentException.class)
    public void a_max_plus_1() {
        MinCalculator.findMin(1001, 50, 50, 50, 50);
    }
}
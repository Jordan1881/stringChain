package stringCahin.stringCahin;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinDecisionTest {

    @Test
    public void R0() {
        assertEquals("Negative", CoinDecision.coinDecision("T", "T", "T", "T"));
    }

    @Test
    public void R1() {
        assertEquals("Negative", CoinDecision.coinDecision("H", "T", "T", "T"));
    }

    @Test
    public void R2() {
        assertEquals("Positive", CoinDecision.coinDecision("H", "H", "T", "T"));
    }

    @Test
    public void R3() {
        assertEquals("Positive", CoinDecision.coinDecision("H", "H", "H", "T"));
    }

    @Test
    public void R4() {
        assertEquals("Positive", CoinDecision.coinDecision("H", "H", "H", "H"));
    }
}
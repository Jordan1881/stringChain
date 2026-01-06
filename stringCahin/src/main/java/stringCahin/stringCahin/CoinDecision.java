package stringCahin.stringCahin;

public class CoinDecision {

    public static String coinDecision(String t1, String t2, String t3, String t4) {
        int hCount = 0;

        if ("H".equals(t1)) hCount++;
        if ("H".equals(t2)) hCount++;
        if ("H".equals(t3)) hCount++;
        if ("H".equals(t4)) hCount++;

        return (hCount >= 2) ? "Positive" : "Negative";
    }
}
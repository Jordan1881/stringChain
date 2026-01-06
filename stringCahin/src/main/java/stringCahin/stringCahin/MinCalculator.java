package stringCahin.stringCahin;

public class MinCalculator {

    public static int findMin(int a, int b, int c, int d, int e) {
        validateRange(a);
        validateRange(b);
        validateRange(c);
        validateRange(d);
        validateRange(e);

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        if (e < min) min = e;

        return min;
    }

    private static void validateRange(int value) {
        if (value < 1 || value > 1000) {
            throw new IllegalArgumentException("Value out of range: " + value);
        }
    }
}
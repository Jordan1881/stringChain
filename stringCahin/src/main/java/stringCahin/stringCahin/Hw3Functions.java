package stringCahin.stringCahin;

public class Hw3Functions {

    public static int func1(int x, int y, int z) {
        int res = 0;

        if ((x != 0) & (y == 0)) {
            res = z / 10;
        }

        res = res / x;
        return res;
    }

    public static int func2(int p, int q) {
        int x = 0;

        if (p > 0) {
            x = q / p;
        }

        return x;
    }

    public static String func3(int x) {
    int result = 10;

    if (x > 0) {
        result = result / x;
    }

    result = result / 0;

    return String.format("result=%d", result);
}
    public static int weakMethod(int x) {
    int result = 1;

    if (x > 0) {
        result = result + 1;
    }

    if (x == 0) {
        result = result / x;
    }

    return result;
}

}

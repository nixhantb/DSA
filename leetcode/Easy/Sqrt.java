public class Sqrt {
    // sqrt
    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int l = 0, h = x, result = 0;

        while (l <= h) {
            int m = l + (h - l) / 2;

            if (m <= x / m) {
                result = m;
                l = m + 1;  
            } else {
                h = m - 1;  
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));  // Should print 2, which is the integer square root of 8
    }
}

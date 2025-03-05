//Problem Link-https://leetcode.com/problems/divide-two-integers/
public class DivideTwoInteger {
    public int divide(int n, int d) {
        // Handle overflow case
        if (n == Integer.MIN_VALUE && d == -1) {
            return Integer.MAX_VALUE; // Prevent overflow
        }

        // Determine sign using XOR (true if signs are different)
        boolean sign = (n > 0) == (d > 0);

        // Convert to long to handle edge cases (avoid overflow)
        long num = Math.abs((long) n);
        long den = Math.abs((long) d);
        int ans = 0;

        while (num >= den) {
            long temp = den, multiple = 1;
            while (num >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            num -= temp;
            ans += multiple;
        }

        return sign ? ans : -ans;
    }
}

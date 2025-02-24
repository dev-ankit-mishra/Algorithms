//Problem Link-https://leetcode.com/problems/valid-perfect-square/?envType=study-plan-v2&envId=binary-search
public class ValidPerfectSquares {
    public boolean isPerfectSquare(int num) {
        long lo = 0;
        long hi = num;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;

    }
}

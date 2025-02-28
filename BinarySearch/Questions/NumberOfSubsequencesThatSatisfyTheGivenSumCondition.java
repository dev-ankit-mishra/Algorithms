//Problem Link-https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/description/

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n - 1;
        long count = 0;
        int mod = (int) 1e9 + 7;

        // Precompute powers of 2 modulo mod
        long[] power = new long[n];
        power[0] = 1;
        for (int k = 1; k < n; k++) {
            power[k] = (power[k - 1] * 2) % mod;
        }

        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                count = (count + power[j - i]) % mod;
                i++;
            } else {
                j--;
            }
        }

        return (int) count;
    }
}

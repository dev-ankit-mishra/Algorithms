//Problem Link-https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
public class LongestSubArrayOf1 {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == 0) {
                i++;
            } else {
                break;
            }
        }
        int j = i;
        int zeroes = 0;
        int max = 0;

        while (j < n) {
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 0) {
                if (zeroes == 0) {
                    zeroes = 1;
                    j++;
                } else {
                    max = Math.max(max, j - i - zeroes);
                    j++;
                    while (nums[i] == 1) {
                        i++;
                    }
                    i++;
                }
            }
        }
        max = Math.max(max, j - i - zeroes);
        if (max == n) {
            return max - 1;
        }
        return max;
    }
}

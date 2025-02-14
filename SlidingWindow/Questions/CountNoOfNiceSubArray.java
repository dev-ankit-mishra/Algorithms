//Problem Link-https://leetcode.com/problems/count-number-of-nice-subarrays/description/
public class CountNoOfNiceSubArray {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0, j = 0, a = 0, b = 0, n = nums.length, count = 0, k2 = 0;
        while (i < n && nums[i] % 2 == 0) {
            i++;
        }
        while (j < n && k != k2) {
            if (nums[j] % 2 == 1) {
                k--;
            }
            j++;
        }
        if (k2 < k) return 0;
        j--;
        b = j + 1;
        while (b < n && nums[b] % 2 == 0) b++;
        b--;
        while (b < n) {
            count += (i - a + 1) * (b - j + 1);
            a = i + 1;

            i++;
            while (i < n && nums[i] % 2 == 0) {
                i++;
            }

            j = b + 1;
            b = j + 1;
            while (b < n && nums[b] % 2 == 0) {
                b++;
            }
            b--;

        }
        return count;

    }
}

//Problem Link-https://leetcode.com/problems/max-consecutive-ones-iii/


public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int k2=0;
        int maxLen=0;

        while (j < n) {
            if (nums[j] == 0) {
                k2++;
            }

            // If k2 exceeds k, shrink the window from the left
            while (k2 > k) {
                if (nums[i] == 0) {
                    k2--;
                }
                i++;
            }

            // Update max length
            maxLen = Math.max(maxLen, j - i + 1);

            j++; // Expand window
        }
        return maxLen;
    }
}

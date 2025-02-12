//Problem Statement-https://leetcode.com/problems/subarray-product-less-than-k/
public class SubArrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int i=0;
        int prod=1;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (prod >= k && i <= j) {
                prod /= nums[i];
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }
}

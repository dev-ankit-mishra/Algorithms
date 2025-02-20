//Problem link-https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

public class FindSmallestDivisorGivenThreshold {
    public int smallestDivisor(int[] nums, int x) {
        int lo = 1;
        int hi = max(nums);
        int ans = 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % mid == 0) sum += nums[i] / mid;
                else sum += nums[i] / mid + 1;
            }
            if (sum <= x) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public int max(int[] arr) {
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (m < arr[i]) {
                m = arr[i];
            }
        }
        return m;
    }
}

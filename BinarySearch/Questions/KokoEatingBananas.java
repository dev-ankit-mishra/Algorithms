//Problem Link-https://leetcode.com/problems/koko-eating-bananas/

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = Integer.MAX_VALUE;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(piles, mid, h)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] arr, int k, int h) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) count += arr[i] / k;
            else {
                count += arr[i] / k + 1;
            }
        }
        return count <= h;
    }
}

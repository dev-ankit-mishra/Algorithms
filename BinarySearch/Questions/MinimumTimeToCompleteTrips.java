//Problem Link-https://leetcode.com/problems/minimum-time-to-complete-trips/description/
public class MinimumTimeToCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = 1;
        long hi = Long.MAX_VALUE;
        long ans = 0;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (isPossible(time, mid, totalTrips)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }

        }
        return ans;
    }

    public boolean isPossible(int[] arr, long k, int t) {
        long sum = 0;  // Sum of transformed values

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += k / arr[i];  // Compute and accumulate directly
            }
            if (sum >= t) return true;
        }


        return false;
    }
}

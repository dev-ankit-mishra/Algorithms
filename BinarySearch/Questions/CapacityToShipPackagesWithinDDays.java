//Problem Link-https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int lo = 1;
        int hi = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (possible(weights, mid, days)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int[] arr, int c, int days) {
        int i = 0;
        while (days > 0 && i < arr.length) {
            int k = c;
            while (i < arr.length && k >= arr[i]) {  // Ensure k is large enough before subtracting
                k -= arr[i];
                i++;
            }

            days--;
        }
        return i == arr.length;

    }
}

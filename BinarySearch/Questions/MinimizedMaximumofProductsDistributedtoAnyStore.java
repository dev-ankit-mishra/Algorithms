//Problem Link-https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/
public class MinimizedMaximumofProductsDistributedtoAnyStore {
    public int minimizedMaximum(int n, int[] quantities) {
        int lo = 1;
        int hi = max(quantities);
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(mid, n, quantities)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }

        }
        return ans;
    }

    public boolean isPossible(int k, int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % k == 0) count += arr[i] / k;
            else count += arr[i] / k + 1;

        }
        return count <= n;
    }

    public int max(int[] arr) {
        int mx = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (mx < arr[i]) {
                mx = arr[i];
            }
        }
        return mx;
    }
}

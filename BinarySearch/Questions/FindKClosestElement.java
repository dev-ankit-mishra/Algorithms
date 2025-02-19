//Problem Link-https://leetcode.com/problems/find-k-closest-elements/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKClosestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int lo = 0;
        int hi = arr.length - 1;
        List<Integer> ans = new ArrayList<>();
        if (arr[0] > x) {
            int i = 0;
            while (i < k) {
                ans.add(arr[i]);
                i++;
            }
            return ans;
        }
        if (arr[n - 1] < x) {
            int i = n - 1;
            while (k > 0) {
                ans.add(arr[i]);
                i--;
                k--;
            }
            Collections.sort(ans);
            return ans;
        }

        int lb = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int i = lb - 1;
        int j = lb;

        while (k > 0 && i >= 0 && j < n) {
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);

            if (di <= dj) {
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while (i < 0 && k > 0) {
            ans.add(arr[j]);
            j++;
            k--;
        }
        while (j >= n && k > 0) {
            ans.add(arr[i]);
            i--;
            k--;
        }


        Collections.sort(ans);
        return ans;

    }
}

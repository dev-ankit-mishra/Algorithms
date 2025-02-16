//Problem Link-https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int[] ans = {-1, -1};

        int fi = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                if (mid > 0 && arr[mid] == arr[mid - 1]) {
                    hi = mid - 1;
                } else {
                    fi = mid;
                    break;
                }
            }
        }
        ans[0] = fi;

        int li = -1;
        lo = 0;
        hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                if (mid < n - 1 && arr[mid] == arr[mid + 1]) {
                    lo = mid + 1;
                } else {
                    li = mid;
                    break;
                }
            }
        }
        ans[1] = li;

        return ans;

    }
}

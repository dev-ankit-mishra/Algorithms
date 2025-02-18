
//Problem Link-https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArray {
    public int search(int[] arr, int x) {
        int lo = 0;
        int hi = arr.length - 1;
        int n = arr.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[lo] <= arr[mid]) {
                if (arr[mid] > x && x >= arr[lo]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (arr[mid] < x && arr[hi] >= x) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}

//Problem Link-https://leetcode.com/problems/median-of-two-sorted-arrays/description/?envType=problem-list-v2&envId=binary-search
public class MedianOf2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n = nums1.length + nums2.length;
        int x = nums1.length;
        int y = nums2.length;
        int[] arr = new int[n];
        while (i < x && j < y) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < x) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < y) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        double median;
        int len = 0;
        if (n % 2 != 0) {
            len = n / 2;
            median = arr[len];
        } else {
            len = n / 2 - 1;
            median = (arr[len] + arr[len + 1]) / 2.0;
        }
        return median;
    }
}

//Problem Link-https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
public class NumberOfSubArrayOfSizeK {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length, i = 0, j = k - 1, sum = 0, count = 0;
        for (int a = 0; a <= k - 1; a++) {
            sum += arr[a];
        }
        if (sum / k >= threshold) count++;

        i++;
        j++;
        while (j < n) {
            sum = sum - arr[i - 1] + arr[j];
            if (sum / k >= threshold) count++;

            i++;
            j++;
        }
        return count;
    }
}

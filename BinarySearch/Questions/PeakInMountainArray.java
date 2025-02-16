//Problem Link-https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int lo=1;
        int hi=arr.length-2;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1]){
                if(arr[mid]>arr[mid+1]){
                    return mid;
                }else{
                    lo=mid+1;
                }
            }else if(arr[mid]<arr[mid-1]){
                hi=mid-1;
            }
        }
        return -1;
    }
}

//Problem Link-https://leetcode.com/problems/single-element-in-a-sorted-array/?envType=study-plan-v2&envId=binary-search
public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] arr) {
        int lo=0;
        int hi=arr.length-1;

        while(lo<hi){
            int mid=lo+(hi-lo)/2;

            if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2!=0 && arr[mid]==arr[mid-1])){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return arr[lo];
    }
}

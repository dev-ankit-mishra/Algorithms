//Problem Link-https://leetcode.com/problems/h-index-ii/?envType=study-plan-v2&envId=binary-search
public class HIndexII {
    public int hIndex(int[] arr) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;

        int ans=0;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(arr[mid]>=n-mid){
                ans=n-mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }


        }
        return ans;
    }

}

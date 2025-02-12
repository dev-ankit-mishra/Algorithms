//Problem Link-https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length, sum=0, i=0, j=0;
        while(j<n && sum<target){
            sum+=nums[j];
            j++;
        }
        j--;
        int min=n+1;
        if(sum>=target)
            min=Math.min(min,j-i+1);
        while(j<n){
            if(sum>=target){
                min=Math.min(min,j-i+1);
                sum-=nums[i];
                i++;
            }else{
                j++;
                if(j<n){
                    sum+=nums[j];
                }
            }
        }
        if(min>n) return 0;
        return min;
    }
}

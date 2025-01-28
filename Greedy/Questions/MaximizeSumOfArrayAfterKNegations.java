//Problem Link-https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/description/
import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && k>0 && nums[i]<0){
            nums[i]*=-1;
            i++;
            k--;
        }
        if(k%2!=0){
            Arrays.sort(nums);
            nums[0]*=-1;
        }
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        return sum;
    }
}

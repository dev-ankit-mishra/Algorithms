//Problem Link-https://leetcode.com/problems/array-partition/?envType=problem-list-v2&envId=greedy

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-1;i=i+2){
            int a=Math.min(nums[i],nums[i+1]);
            sum+=a;

        }
        return sum;
    }
}

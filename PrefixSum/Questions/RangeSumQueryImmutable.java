//Problem Link-https://leetcode.com/problems/range-sum-query-immutable/description/
import java.util.Arrays;

public class RangeSumQueryImmutable {
    int[] arr;
    public RangeSumQueryImmutable(int[] nums) {
        arr= Arrays.copyOf(nums,nums.length);
        for(int i=1;i<nums.length;i++){
            arr[i]+=arr[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if(left==0){
            return arr[right];
        }
        return arr[right]-arr[left-1];
    }
}

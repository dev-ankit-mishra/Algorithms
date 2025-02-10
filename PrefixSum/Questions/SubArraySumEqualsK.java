//Problem Link-https://leetcode.com/problems/subarray-sum-equals-k/description/
import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subArraySum(int[] nums, int k) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int rem=ele-k;

            if(ele==k){
                count++;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }

        return count;
    }
}

//Problem Link-https://leetcode.com/problems/subsets-ii/?envType=problem-list-v2&envId=bit-manipulation

import java.util.*;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        int s=1<<n;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<s;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    arr.add(nums[j]);
                }
            }
            Collections.sort(arr);
            if(!ans.contains(arr))
                ans.add(arr);
        }
        return ans;

    }
}

//Problem Link-https://leetcode.com/problems/subsets/

import java.util.ArrayList;
import java.util.List;


public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
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
            ans.add(arr);
        }
        return ans;
    }
}

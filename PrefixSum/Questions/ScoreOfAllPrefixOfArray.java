//Problem Link-https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/description/
public class ScoreOfAllPrefixOfArray {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long[] conver=new long[n];
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(i>0){
                max=Math.max(nums[i],max);
            }
            conver[i]=nums[i] + max;

        }
        for(int i=1;i<n;i++){
            conver[i]+=conver[i-1];
        }
        return conver;
    }
}

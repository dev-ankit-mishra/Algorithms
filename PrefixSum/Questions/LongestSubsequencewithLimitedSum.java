import java.util.Arrays;

public class LongestSubsequencewithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans=new int[queries.length];
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int target=queries[i];
            int s=0;
            int e=nums.length-1;
            int max=0;
            while(s<=e){
                int mid=(s+e)/2;
                if(nums[mid]>target){
                    e=mid-1;
                }else{
                    max=Math.max(mid+1,max);
                    s=mid+1;
                }
            }
            ans[i]=max;
        }
        return ans;

    }
}

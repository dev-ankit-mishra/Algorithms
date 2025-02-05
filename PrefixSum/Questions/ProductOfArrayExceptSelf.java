//Problem Link-https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        int[] suf=new int[n];
        suf[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suf[i]=nums[i+1]*suf[i+1];
        }
        for(int i=0;i<n;i++){
            nums[i]=pre[i]*suf[i];
        }
        return nums;
    }
}

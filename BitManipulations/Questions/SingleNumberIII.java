//Problem Link-https://leetcode.com/problems/single-number-iii/description/
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int[] arr=new int[2];
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++){
            x^=nums[i];
        }
        int b1=0;
        int b2=0;
        int bit=(x&x-1) ^x;
        for(int i=0;i<n;i++){
            if((nums[i] & bit)!=0){
                b1^=nums[i];
            }else{
                b2^=nums[i];
            }
        }
        arr[0]=b1;
        arr[1]=b2;


        return arr;

    }
}

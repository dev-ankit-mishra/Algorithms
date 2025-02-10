//Problem Link-https://leetcode.com/problems/minimum-penalty-for-a-shop/description/
public class MinimumPenaltyForAShop {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='Y'){
                arr[i]=1;
            }else{
                arr[i]=-1;
            }
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        int max=arr[0];
        int idx=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                idx=i;
            }
        }
        if(max<1){
            return 0;
        }
        return idx+1;

    }
}

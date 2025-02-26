//Problem Link-https://leetcode.com/problems/arranging-coins/?envType=study-plan-v2&envId=binary-search
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long lo=0;
        long hi=(long)n;

        while(lo<=hi){
            long mid=lo+(hi-lo)/2;

            if((mid*(mid+1)/2)<=n){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return (int)hi;

    }
}

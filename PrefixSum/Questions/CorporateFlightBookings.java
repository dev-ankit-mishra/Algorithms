//Problem Link-https://leetcode.com/problems/corporate-flight-bookings/description/
public class CorporateFlightBookings {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int l=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<l;i++){
            int first=arr[i][0];
            int last=arr[i][1];
            ans[first-1]+=arr[i][2];
            if(last<n){
                ans[last]-=arr[i][2];
            }
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}

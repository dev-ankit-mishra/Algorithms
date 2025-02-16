public class LowerBound {
    public static int search(int[] arr,int start,int end,int target){
        int lb=arr.length;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]>=target){
                lb=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return lb;
    }
}

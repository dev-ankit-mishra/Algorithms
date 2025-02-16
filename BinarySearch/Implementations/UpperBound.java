public class UpperBound {
    public static int upperBound(int[] arr,int start,int end,int target){
        int ub=arr.length;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]>target){
                ub=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ub;
    }
}

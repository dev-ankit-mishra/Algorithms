public class BinarySearchAlgo {
    public static int search(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

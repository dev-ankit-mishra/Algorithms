
//Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,0,arr.length-1,3));
    }
    public static int search(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=(start + end)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return search(arr,mid+1,arr.length-1,target);
        }
        return search(arr,0,mid-1,target);
    }

}

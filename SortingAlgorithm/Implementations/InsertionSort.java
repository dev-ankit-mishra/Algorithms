//Insertion Sort Implementation

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,8,4,6,9,7,5,1,23,6,4,5};
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        sort(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
    }
}

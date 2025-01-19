//Selection Sort
public class SelectionSort {
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

        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
    }
}

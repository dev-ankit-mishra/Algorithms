//Quick Sort
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,2,4,1,7,6,9,8,3};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        quickSort(arr,0,arr.length-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void quickSort(int[] arr,int lo,int hi){
        if(hi<=lo) return;
        int pivotPos=partition(arr,lo,hi);
        quickSort(arr,lo,pivotPos-1);
        quickSort(arr,pivotPos+1,hi);
    }
    public static int partition(int[] arr,int lo,int hi){
        int pivot=arr[lo];
        int pos=lo;
        int smallerCount=0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot){
                smallerCount++;
            }
        }
        int correctPos=lo+smallerCount;
        swap(arr,pos,correctPos);
        int i=lo;
        int j=hi;
        while(i!=j){
            if(arr[i]<pivot){
               i++;
            } else if (arr[j]>pivot) {
               j--;
            }else if(arr[i]>pivot && arr[j]<pivot){
                swap(arr,i,j);
            }
        }
        return correctPos;

    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

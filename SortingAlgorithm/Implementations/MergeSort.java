//Merge Sort
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,1,6,7,9};
        printArray(arr);
        mergeSort(arr);
        printArray(arr);


    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] left=new int[n/2];
        int[] right=new int[n-n/2];
        System.arraycopy(arr, 0, left, 0, n / 2);
        System.arraycopy(arr, n / 2, right, 0, n - n / 2);
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);

    }
    public static void merge(int[] a,int[] b,int[] c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                k++;
                i++;
            }else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        if(i!=a.length){
            while(i<a.length){
                c[k]=a[i];
                k++;
                i++;
            }
        }else{
            while(j<b.length){
                c[k]=b[j];
                k++;
                j++;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

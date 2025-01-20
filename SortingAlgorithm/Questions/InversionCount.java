
public class InversionCount {
    static int count=0;
    public static void main(String[] args) {
        int[] nums={8,2,5,4,1,3};
        mergeSort(nums);
        for(int ele :nums){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(count);
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
                count+=a.length-i;
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
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] left=new int[n/2];
        int[] right=new int[n-n/2];
        System.arraycopy(arr, 0, left, 0, n / 2);
        System.arraycopy(arr,  n / 2, right, 0, n - n / 2);
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
    }

}

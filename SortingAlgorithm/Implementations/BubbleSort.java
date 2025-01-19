//Bubble Sort
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={-2,1,4,-1,7,3,6};
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        sort1(arr);
        for(int ele: arr){
            System.out.print(ele + " ");
        }

    }

    //Method-1
    public static void sort1(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    //Method-2
    public static void sort2(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }

        }
    }

    //Method-3(Optimized Solution)
    public static void sort3(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag) break;
        }
    }

}

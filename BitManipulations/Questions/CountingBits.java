//Problem Link-https://leetcode.com/problems/counting-bits/?envType=problem-list-v2&envId=bit-manipulation
public class CountingBits {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];

        for(int i=0;i<=n;i++){
            int count=0;
            int val=i;
            while(val!=0){
                val=val & (val-1);
                count++;
            }
            arr[i]=count;
        }
        return arr;

    }
}

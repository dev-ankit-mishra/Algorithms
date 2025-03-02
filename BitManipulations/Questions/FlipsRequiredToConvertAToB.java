public class FlipsRequiredToConvertAToB {
    public static int NumberOfFlips(int a,int b){
        int val=a^b;
        int count=0;

        while(val!=0){
            count++;
            val=val&(val-1);
        }
        return count;
    }
}

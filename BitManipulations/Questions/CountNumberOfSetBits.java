public class CountNumberOfSetBits {
    public static void main(String[] args) {
        System.out.println(countBits(15));
    }
    public static int countBits(int n){
        int count=0;

        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}

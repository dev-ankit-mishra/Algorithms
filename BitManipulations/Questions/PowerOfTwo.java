public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }
    public static boolean isPowerOfTwo(int n){
        if((n & n-1)==0){
            return true;
        }else{
            return false;
        }
    }
}

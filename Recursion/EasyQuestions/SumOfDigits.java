//Sum of Digits
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
    public static int sumOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}

//Reverse a number
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    public static int reverse(int n){
        int base=(int)Math.floor(Math.log10(n) + 1);
        return helper(n,base);
    }
    public static int helper(int n,int base){
        if(n%10==0){
            return n;
        }
        return (n%10)*(int)Math.pow(10,base-1) + helper(n/10,base-1);
    }
}


//print 10 to 1 and 1 to 10.
public class PrintNumbers{
    public static void main(String[] args) {
        printNumber(10);
    }
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
        System.out.println(n);
    }
}

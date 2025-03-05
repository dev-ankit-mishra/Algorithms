public class KthBitSetOrNot {
    public static void main(String[] args) {
        System.out.println(isSetOrNot(13,4));
    }
    public static boolean isSetOrNot(int n,int k){
        if((n & (1<<k))!=0){
            return true;
        }
        else{
            return false;
        }
    }
}

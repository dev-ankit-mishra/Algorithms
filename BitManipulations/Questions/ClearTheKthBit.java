public class ClearTheKthBit {
    public static void main(String[] args) {
        System.out.println(clearBit(13,1));
    }
    public static int clearBit(int n,int k){
        if((n&(1<<k))!=0){
            return n ^ 1<<k;
        }else{
            return n;
        }
    }
}

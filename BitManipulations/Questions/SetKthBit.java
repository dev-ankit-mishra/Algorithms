public class SetKthBit {
    public static void main(String[] args) {
        System.out.println(setBit(13,1));
    }
    public static int setBit(int n,int k){

            return n | 1<<k;


    }
}

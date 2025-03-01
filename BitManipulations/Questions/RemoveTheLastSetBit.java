public class RemoveTheLastSetBit {
    public static void main(String[] args) {
        System.out.println(removeBit(8));
    }
    public static int removeBit(int n){
        return n & n-1;
    }
}

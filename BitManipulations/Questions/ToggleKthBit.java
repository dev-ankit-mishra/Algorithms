public class ToggleKthBit {
    public static void main(String[] args) {
        System.out.println(ToggleBit(13,2));
    }
    public static int ToggleBit(int n,int k){

            return n ^ 1<<k;

    }
}

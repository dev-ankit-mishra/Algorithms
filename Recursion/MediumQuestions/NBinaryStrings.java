//N-Binary Strings
public class NBinaryStrings {
    public static void main(String[] args) {
        binaryStrings("", 4);
    }

    public static void binaryStrings(String ans, int n) {
        if (ans.length() == n) {
            System.out.println(ans);
            return;
        }
        if (!ans.isEmpty() && ans.charAt(ans.length() - 1) == '1') {
            binaryStrings(ans + "0", n);

        } else {
            binaryStrings(ans + "1", n);
            binaryStrings(ans + "0", n);
        }
    }
}

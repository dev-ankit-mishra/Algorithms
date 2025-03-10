//Problem Link-https://leetcode.com/problems/reverse-integer/description/?envType=problem-list-v2&envId=math
public class ReverseInteger {
    public int reverse(int x) {

        int ans=0;

        while(x!=0){
            int rem=x%10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Overflow for negative numbers
            }
            ans=(ans*10)+rem;
            x/=10;
        }

        return ans;


    }
}

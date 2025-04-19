//Problem Link-https://leetcode.com/problems/add-digits/?envType=problem-list-v2&envId=math

public class AddDigits {
    public int addDigits(int num) {
        int sum=num;
        while(sum/10!=0){
            int n=sum;
            sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=rem;
                n=n/10;
            }
        }
        return sum;
    }
}

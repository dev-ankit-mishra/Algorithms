public class DecimalToBinary {
    public static  String convertStringToBinary(int n){
        StringBuilder s=new StringBuilder();

        while(n!=0){

            if(n%2==1){
                s.append('1');
            }else{
                s.append('0');
            }

            n/=2;
        }

        s.reverse();


        return s.toString();
    }
}

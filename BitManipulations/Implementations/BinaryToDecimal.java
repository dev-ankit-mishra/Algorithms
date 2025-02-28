public class BinaryToDecimal {
    public static  int convertBinaryToDecimal(String s){
        int ans=0;
        int l=s.length();
        int prod=1;
        for(int i=l-1;i>=0;i--){
          if(s.charAt(i)=='1'){
              ans+=prod;
          }
          prod*=2;
        }

        return ans;
    }
}

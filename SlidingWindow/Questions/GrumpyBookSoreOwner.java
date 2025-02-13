//Problem Link-https://leetcode.com/problems/grumpy-bookstore-owner/description/
public class GrumpyBookSoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int unsat=0,max=0,j=minutes-1,i=0;
        int n=customers.length,a=i,b=j;
        for(int x=0;x<minutes;x++){
            unsat+=customers[x]*grumpy[x];
        }
        while(j<n){
            if(max<unsat){
                max=unsat;
                a=i;
                b=j;
            }
            unsat=unsat-customers[i]*grumpy[i];
            i++;
            j++;
            if(j<n)unsat=unsat+customers[j]*grumpy[j];
        }
        for(int k=a;k<=b;k++){
            grumpy[k]=0;
        }
        int sum=0;
        for(int k=0;k<n;k++){
            if(grumpy[k]==0){
                sum+=customers[k];
            }
        }
        return sum;

    }
}

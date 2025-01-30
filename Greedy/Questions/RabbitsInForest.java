//Problem Link-https://leetcode.com/problems/rabbits-in-forest/description/
import java.util.*;

public class RabbitsInForest {
    public int numRabbits(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            map.put(ele+1,map.getOrDefault(ele+1,0)+1);
        }
        int ans=0;
        for (Map.Entry<Integer,Integer> set :
                map.entrySet()){
            int key=set.getKey();
            int val=set.getValue();
            int q=val/key;
            int r=val%key;
            ans+=(q*key);
            if(r>0){
                ans+=key;
            }

        }
        return ans;
    }
}

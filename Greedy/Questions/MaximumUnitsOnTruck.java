//Problem Link-https://leetcode.com/problems/maximum-units-on-a-truck/description/

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a1, a2)->a2[1]-a1[1]);
        int sum=0;
        for(int i=0;i<boxTypes.length;i++){
            int unit=boxTypes[i][1];
            int box=boxTypes[i][0];
            int min=Math.min(box,truckSize);
            truckSize-=min;
            sum+=min*unit;
            if(truckSize==0){
                return sum;
            }
        }
        return sum;
    }
}

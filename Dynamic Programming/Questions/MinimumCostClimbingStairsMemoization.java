//Problem Link-https://leetcode.com/problems/min-cost-climbing-stairs/

import java.util.Arrays;

public class MinimumCostClimbingStairsMemoization {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));

    }
    public int helper(int[] cost,int i,int[] dp){
        if(i<=1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        return dp[i]=cost[i]+Math.min(helper(cost,i-1,dp),helper(cost,i-2,dp));

    }
}

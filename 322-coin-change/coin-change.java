class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]= new int[coins.length][amount+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
        

        int ans= unbounded(coins,0,amount,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
        
    }
    int unbounded(int arr[],int idx,int amnt,int dp[][]){
        if(arr.length==idx) return Integer.MAX_VALUE;

        if(amnt==0) return 0;

        int take=Integer.MAX_VALUE;
        if(dp[idx][amnt]!=-1) return dp[idx][amnt];
        if(arr[idx]<=amnt){
            int ans=unbounded(arr,idx,amnt-arr[idx],dp);
            if(ans!=Integer.MAX_VALUE) {
                take=1+ans;
            }
        }
        int notTake=unbounded(arr,idx+1,amnt,dp);

        dp[idx][amnt]= Math.min(take,notTake);
        return  dp[idx][amnt];
    }
}
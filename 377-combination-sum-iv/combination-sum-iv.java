class Solution {
    public int combinationSum4(int[] nums, int target) {

        int dp[]= new int[target+1];
        
            Arrays.fill(dp,-1);
        
        return knapSack(nums,target,dp);
        
    }
    int knapSack(int nums[],int target,int dp[]){
       if(target==0) return 1;
       int take=0;
       if(dp[target]!=-1) return dp[target];

       for(int i:nums){
        if(i<=target){
            take+=knapSack(nums,target-i,dp);
        }
       }
       dp[target]=take;
       return  dp[target];
    }
}
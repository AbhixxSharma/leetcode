class Solution {
    public boolean canPartition(int[] nums) {

        int sum=0;
       
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

        }
         int dp[][]= new int[nums.length][sum/2+1];
         for(int row[]:dp){
            Arrays.fill(row,-1);
         }
        if(sum%2!=0) return false;
        return subs(nums,0,sum/2,dp);
        
    }
    boolean subs(int nums[],int idx,int target,int dp[][]){


        if(target==0) return true;
        

        if(idx==nums.length){
            return false;
            
        }
        boolean take=false;
        if(dp[idx][target]!=-1) return dp[idx][target]==1;
        if(nums[idx]<=target){
            take=subs(nums,idx+1,target-nums[idx],dp);
        }
        boolean notTake=subs(nums,idx+1,target,dp);
         dp[idx][target]=(take|| notTake)?1:0;
         return dp[idx][target]==1;


    }
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int totalSum=0;
        for(int i:nums){
            totalSum+=i;
        }
        if((target+totalSum)%2!=0) return 0;
        if(Math.abs(target)>totalSum) return 0;

        int reqSum=(target+totalSum)/2;
       return subs(nums,0,reqSum);

        
    }
    int  subs(int nums[],int idx,int req){
       if (idx == nums.length) {
    return (req == 0) ? 1 : 0;
}

         int take=0;
        if(nums[idx]<=req){
            take=subs(nums,idx+1,req-nums[idx]);

        }
        int notTake=subs(nums,idx+1,req);

        return  take+notTake;
    }
}
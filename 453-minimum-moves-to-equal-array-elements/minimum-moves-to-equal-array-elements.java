class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0];
        int sum=0;
        
        int moves=0;
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
       }
        moves=sum-nums[0]*nums.length;
        return moves;

        
        
    }
}
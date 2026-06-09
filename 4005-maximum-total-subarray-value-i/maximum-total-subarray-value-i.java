class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long  sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max= Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            
            
                
            
        }
        // sum=(max-min)*k;

        return (long)(max-min)*k;
        
    }
}
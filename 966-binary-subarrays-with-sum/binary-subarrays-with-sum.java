class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int binarySum=0;
            for(int j=i;j<nums.length;j++){
             binarySum+=nums[j];
                if(binarySum==goal){
                    cnt++;
                }
            }
        }
        return cnt;

        
        
        
    }
}
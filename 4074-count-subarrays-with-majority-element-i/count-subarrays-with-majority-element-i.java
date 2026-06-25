class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            int min=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    min++;
                }
                int len= j-i+1;
                if(2*min>len){
                    x++;
                }
            }
        }
        return x;
        
    }
}
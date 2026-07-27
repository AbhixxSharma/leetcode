class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int x=nums.length-1;
        int y=nums.length-2;
        Arrays.sort(nums);
        return (nums[x]-1)*(nums[y]-1);
        
    }
}
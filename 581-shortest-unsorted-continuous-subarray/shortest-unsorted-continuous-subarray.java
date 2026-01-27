class Solution {
    public int findUnsortedSubarray(int[] nums) {
        List<Integer> lst= new ArrayList<>();
        for(int i:nums){
            lst.add(i);
        }
         
        Collections.sort(lst);
        int cnt=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=lst.get(i)){
                min=Math.min(min,i);
                max=Math.max(max,i);
                
            }
        }
        if(Integer.MIN_VALUE==max) return 0;

        return max-min+1;
        
        
    }
}
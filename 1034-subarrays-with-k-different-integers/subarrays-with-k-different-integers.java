class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarr(nums,k)-subarr(nums,k-1);
       
    }
    public int subarr(int nums[],int k){
        int cnt=0;
        int l=0;
       HashMap<Integer,Integer> map= new HashMap<>();
       for(int r=0;r<nums.length;r++){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        // shrink
        while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);   
                }
                l++;
            }
            cnt+=r-l+1;
       }
       return cnt;
    
    }
}
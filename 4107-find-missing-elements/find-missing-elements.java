class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer> lst= new ArrayList<>();
         List<Integer> lst2= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            lst.add(nums[i]);
             min=Math.min(min,nums[i]);
             max=Math.max(max,nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(!lst.contains(i)){
                lst2.add(i);
            }

        }
        Collections.sort(lst2);
        return lst2;
        
    }
}
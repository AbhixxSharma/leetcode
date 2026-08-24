class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashSet<Integer> set= new HashSet<>();
       ArrayList<Integer> lst= new ArrayList<>();

       for(int i:nums){
         set.add(i);
       }
       for(int i=0;i<nums.length;i++){
         if(!set.contains(i+1)){
            lst.add(i+1);
         }
       }
       return lst;
       
        
    }
}
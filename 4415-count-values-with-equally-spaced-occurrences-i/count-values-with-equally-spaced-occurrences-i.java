class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
             if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
           
        }
        int cnt=0;
         for (List<Integer> i: map.values()){
            if(i.size()==3){
               int a= i.get(0);
               int b=i.get(1);
               int c= i.get(2);

               if(b-a ==c-b){
                  cnt++;
               }

            }
        }
        return cnt;
        
        
    }
}
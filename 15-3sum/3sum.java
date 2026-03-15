class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                  List<Integer> lst= new ArrayList<>();
                int sum=nums[l]+nums[r]+nums[i];

                if(sum==0){
                    lst.add(nums[i]);
                      lst.add(nums[l]);
                        lst.add(nums[r]);
                     ll.add(lst);

                     while(l<r && nums[l]== nums[l+1]) l++;
                     while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;

                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
            // ll.add(lst);
        }
        // ll.add(lst);
        return ll;

        
    }
}
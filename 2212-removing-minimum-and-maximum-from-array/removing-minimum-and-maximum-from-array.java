class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        if(nums.length==1) return 1;
        for(int i:nums){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                cnt1=i;
            }
            if(min==nums[i]){
                cnt2=i;
            }
           
        }
           cnt3 = Math.max(cnt1, cnt2) + 1;

        int cnt4=0;
        int cnt5=0;
        int cnt6=0;
        for(int i=nums.length-1;i>=0;i--){
            if(max==nums[i]){
                cnt4=i;

            }
            if(min==nums[i]){
                cnt5=i;
            }

        }
           cnt6 = nums.length - Math.min(cnt4, cnt5);
          int cnt7 = Math.min(cnt1, cnt2) + 1
             + nums.length - Math.max(cnt1, cnt2);


         
    return Math.min(cnt3, Math.min(cnt6, cnt7));
        
    }
}
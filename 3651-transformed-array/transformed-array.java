class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[i]=nums[(nums[i]+i)%n];
            }
            else if(nums[i]<0){
                int nw=Math.abs(nums[i]);
                int k=(i-nw)%n;
                if(k<0){
                    k+=n;
                }
                res[i]=nums[k];

            }
            else{
                res[i]=nums[i];
            }
        }
        return res;
        
    }
}
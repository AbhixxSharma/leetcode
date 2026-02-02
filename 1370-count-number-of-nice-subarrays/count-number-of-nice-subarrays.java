class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

       
        // int max=0;
        //  for(int i=0;i<nums.length;i++){
        //     int cnt=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]%2!=0){
        //             cnt++;
        //         }

        //         if(cnt==k){
        //             max++;
        //         }
        //     }
        //  }
        //  return max;
        return subarr(nums,k) -subarr(nums,k-1);
    
           
        }
        public int subarr(int nums[],int k){
             int cnt=0;
        int sum=0;
        int l=0;
        if(k<0) return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) sum++;

            while(sum>k){
                if(nums[l]%2!=0) sum--;
                l++;
            }
            cnt+=(i-l+1);
           
            


        }
        return cnt;
        }
        
    
}
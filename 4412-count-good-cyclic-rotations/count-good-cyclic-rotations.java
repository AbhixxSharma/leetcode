class Solution {
    public int countGoodRotations(int[] nums) {
        long sum=0;
        for(int i:nums){
            sum+=i;
        }
        int n=nums.length;
        int k=nums.length/2;
        int l=0;
        long half=0;
        int cnt=0;
       for (int r = 0; r < n + k - 1; r++) {

            half += nums[r % n];

            if (r - l + 1 == k) {

                if (half > sum - half) {
                    cnt++;
                }

                half -= nums[l % n];
                l++;
            }
        }
        return cnt;
        
    }
}
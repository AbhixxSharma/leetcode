class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int pre[]= new int[n];
        int suff[]= new int[n];
        pre[0]=0;
        int sum1=0;
        int sum2=0;
        for(int i=1;i<n;i++){
            sum1+=nums[i-1];
            pre[i]=sum1;
            

        }
        suff[n-1]=0;
        for(int i=n-2;i>=0;i--){
            sum2+=nums[i+1];
            suff[i]=sum2;
        }
        // System.out.print(Arrays.toString(suff));
        int total[]= new int[n];
        for(int i=0;i<n;i++){
            total[i]=Math.abs(pre[i]-suff[i]);

        }
        return total;
    }
}
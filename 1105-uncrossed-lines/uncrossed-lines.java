class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int dp[][]= new int[nums1.length+1][nums2.length+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }

        return lcs(nums1,nums2,0,0,dp);
        
    }
    int lcs(int nums1[],int nums2[],int i,int j,int dp[][]){
        int max=0;
        if(nums1.length==i|| nums2.length==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(nums1[i]==nums2[j]){
          return  dp[i][j]= 1+lcs(nums1,nums2,i+1,j+1,dp);
        }
       
           

       
        // dp[i][j]=max;
        return dp[i][j]= max=Math.max(lcs(nums1,nums2,i+1,j,dp),lcs(nums1,nums2,i,j+1,dp));
        // retur Math.max(lcs(nums1,nums2,i+1,j),lcs(nums1,nums2,i,j+1));

    }
}
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {


        int dp[][][]= new int[strs.length][m+1][n+1];
        for(int [][]r:dp){
            for(int c[]:r){
                Arrays.fill(c,-1);
            }
        }
        return knapSack(strs,0,n,m,dp);
        
    }
    int knapSack(String arr[],int idx,int n,int m,int dp[][][]){

        if(arr.length==idx)return 0;
        int zero=0;
        int one=0;

        for(char a:arr[idx].toCharArray()){
            if(a=='0') zero++;
            else{
                one++;
            }
        }
        if(dp[idx][m][n]!=-1) return dp[idx][m][n];
        int take=0;
        if(one<=n && zero<=m){
            take=1+knapSack(arr,idx+1,n-one,m-zero,dp);

        }
        int notTake=knapSack(arr,idx+1,n,m,dp);

       dp[idx][m][n]=Math.max(take,notTake);

       return dp[idx][m][n];


    }
}
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        int ans=0;

        int dp[][]= new int[n][m];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans=Math.max(ans,dfs(i,j,matrix,dp));
            }
        }
        return ans;
         
        

        
        
    }
    int dfs(int r,int c,int mat[][],int dp[][]){

        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};

        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int cnt=1;

        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];

            if(nr>=0 && nr<mat.length&& nc>=0 && nc<mat[0].length&&mat[nr][nc]>mat[r][c]){
               cnt=Math.max(cnt,1+dfs(nr,nc,mat,dp));
            }
           


        }
        dp[r][c]=cnt;
        return dp[r][c];
    }
}
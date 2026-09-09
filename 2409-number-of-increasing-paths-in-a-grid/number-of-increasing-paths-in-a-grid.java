class Solution {
    static final int MOD = 1_000_000_007;
    public int countPaths(int[][] grid) {
        int dp[][]= new int[grid.length][grid[0].length];
        for(int i[]:dp){
            Arrays.fill(i,-1);
            
        }
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 sum = (sum + dfs(i, j, grid, dp)) % MOD;
            }
        }
        return sum;
    }
    int dfs(int r,int c,int mat[][],int dp[][]){
        int dr[]={1,-1,0,0};
        int dc[]={0,0,1,-1};
        if(dp[r][c]!=-1) return dp[r][c];
        int cnt=1;

        for(int i=0;i<4;i++){
            int nr= r+dr[i];
            int nc=c+dc[i];

            if(nr>=0 && nr<mat.length && nc>=0 && nc<mat[0].length && mat[nr][nc]>mat[r][c]){
               cnt = (cnt + dfs(nr, nc, mat, dp)) % MOD;
            }
        }
        dp[r][c]=cnt;
        return dp[r][c];
    }
}
class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][]= new int[n][m][m];
        for (int[][] row : dp) {
        for (int[] col : row) {
            Arrays.fill(col, -1);
        }
    }

        return path(grid,0,0,grid[0].length-1,dp);
        
    }
    int path(int grid[][],int r,int c1,int c2,int dp[][][]){
        int n = grid.length;
        int m = grid[0].length;
        int collect=0;
        if(c1<0|| c1>=m||c2<0||c2>=m){
            return -(int)1e9;
        }
        if(r==n-1){
            if(c1==c2){
                return grid[r][c1];
            }
            else{
                return grid[r][c1]+grid[r][c2];
            }
        }
        if(dp[r][c1][c2]!=-1) return dp[r][c1][c2];

          int cherries;
       if (c1 == c2)
           cherries = grid[r][c1];
      else
           cherries = grid[r][c1] + grid[r][c2];
        int op1=path(grid,r+1,c1-1,c2-1,dp);
        int op2=path(grid,r+1,c1-1,c2,dp);
        int op3=path(grid,r+1,c1-1,c2+1,dp);

        int op4=path(grid,r+1,c1,c2-1,dp);
        int op5=path(grid,r+1,c1,c2,dp);
        int op6=path(grid,r+1,c1,c2+1,dp);

        int op7=path(grid,r+1,c1+1,c2-1,dp);
        int op8=path(grid,r+1,c1+1,c2,dp);
        int op9=path(grid,r+1,c1+1,c2+1,dp);

       dp[r][c1][c2]= cherries + Math.max(op1,
        Math.max(op2,
        Math.max(op3,
        Math.max(op4,
        Math.max(op5,
        Math.max(op6,
        Math.max(op7,
        Math.max(op8, op9))))))));

        return dp[r][c1][c2];

    }
}
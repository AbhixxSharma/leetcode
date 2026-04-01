class Solution {
    public int minCost(int[][] grid) {
      int  n = grid.length;
       int  m = grid[0].length;

        int[][][] dp = new int[n][m][1024];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
             }

        return grir(grid, 0, 0,0, dp);
        
    }
    public int grir(int [][]grid,int row,int col,int xor,int dp[][][]){
        if(row>=grid.length ||col>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        xor^=grid[row][col];
        if(row==grid.length-1  && col==grid[0].length-1){
           
            return xor;

        }
         if(dp[row][col][xor] != -1) return dp[row][col][xor];

        
           int right= grir(grid,row+1,col,xor,dp);
        
      
          int down=  grir(grid,row,col+1,xor,dp);
          return dp[row][col][xor]=Math.min(right,down);
        
    }
}
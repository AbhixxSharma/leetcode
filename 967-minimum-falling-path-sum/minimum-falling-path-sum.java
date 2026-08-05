class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;

        int dp[][]= new int[n][n];
        // ye hai base case....
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                // down ke liye
                int down=dp[i-1][j];

                // 
                 int diaLeft=(j>0)?dp[i-1][j-1]:(int)1e9;

                 int diaRight=(j<n-1)?dp[i-1][j+1]:(int)1e9;

                 dp[i][j]=matrix[i][j]+Math.min(down,Math.min(diaLeft,diaRight));
            }
        }
        int miniSum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            miniSum=Math.min(miniSum,dp[n-1][i]);
        }

        return miniSum;
        
    }
}
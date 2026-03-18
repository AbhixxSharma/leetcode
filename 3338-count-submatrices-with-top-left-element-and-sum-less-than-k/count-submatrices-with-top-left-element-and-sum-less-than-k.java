class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int t=0;
        for(int i=0;i<grid.length;i++){
            int sum=0;
            for(int j=0;j<grid[0].length;j++){
                if(i>0){grid[i][j]+=grid[i-1][j];
                }
                sum+=grid[i][j];
                
                
                if(sum<=k)t++;
            }
        }
        return t;
        
    }
}
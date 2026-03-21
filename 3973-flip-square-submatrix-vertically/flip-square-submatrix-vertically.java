class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i=x;
        int z=x+k-1;
        while(i<z){
            for(int j=y;j<y+k;j++){
                int temp=grid[i][j];
                grid[i][j]=grid[z][j];
                grid[z][j]=temp;
            }
            i++;
            z--;
        }
        return grid;
        
    }
}
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j];
            }
        }
        long sum2=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[0].length;j++){
                sum2+=grid[i][j];
            }
            if(sum==2*sum2)return true;
        }
        sum2=0;
        for(int j=0;j<grid[0].length-1;j++){
            for(int i=0;i<grid.length;i++){
                sum2+=grid[i][j];
            }
            if(sum==sum2*2)return true;
        }
        return false;
        // long ver[]= new long[grid.length];
        // long hor[]= new long[grid[0].length];
        // long vrSum=0;
        // long hrSum=0;
        // for(int i=0;i<grid.length;i++){
        //     vrSum+=grid[i][0];
        // }
        // for(int j=0;j<grid[0].length;j++){
        //     hrSum+=grid[0][j];
        // }
        // System.out.print(hrSum);
        // return (sum/2)==hrSum||(sum/2)==vrSum;
        
    }
}
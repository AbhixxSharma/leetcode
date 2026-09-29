class Solution {
    public boolean hasValidPath(char[][] grid) {

        Boolean dp[][][]= new Boolean[grid.length][grid[0].length][grid.length+grid[0].length+1];
       return valid(grid,0,0,0,dp);
        
    }
    static boolean valid( char grid[][],int i ,int j,int cnt,Boolean dp[][][]){
        // if(grid[0][0]==')') return false;

        if(i<0 || j<0|| i>=grid.length|| j>=grid[0].length) return false;

        if(grid[i][j]=='('){
            cnt++;
        }
        else{
            cnt--;
        }
        if(cnt<0) return false;
        if(dp[i][j][cnt]!=null) return dp[i][j][cnt];
        if(i==grid.length-1&& j==grid[0].length-1){
            return cnt==0;
        }

        boolean right=valid(grid,i+1,j,cnt,dp);
        boolean down= valid(grid,i,j+1,cnt,dp);

        return dp[i][j][cnt]=right||down;
        

        




    }

}
class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    
                    bfs(grid,i,j);
                    cnt++;
                }
          
            }
        }
        return cnt;
        
    }
    public void bfs(char grid[][],int r,int c){
        Queue<int[]> q1=new LinkedList<>();
        q1.add(new int[]{r,c});
        grid[r][c] = '0';
        while(!q1.isEmpty()){
            int x[]=q1.poll();
            int row= x[0];
            int col=x[1];
        

        // down
        if(row+1<grid.length&& grid[row+1][col]=='1'){
            grid[row+1][col]='0';
             q1.add(new int[]{row+1,col});

        }
        if(row-1>=0 && grid[row-1][col]=='1'){
            grid[row-1][col]='0';
            q1.add(new int[]{row-1,col});
        }
        if(col+1<grid[0].length&& grid[row][col+1]=='1'){
            grid[row][col+1]='0';
            q1.add(new int[]{row,col+1});
        }
        if(col-1>=0&& grid[row][col-1]=='1'){
            grid[row][col-1]='0';
            q1.add(new int[]{row,col-1});
        }
    }
    }
}
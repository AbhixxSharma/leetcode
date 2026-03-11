class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q1= new LinkedList<>();
        int one=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q1.add(new int[]{i,j});
                }if(grid[i][j]==1){
                    one++;
                }
            }
        }
         int level = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}}; 

        while(!q1.isEmpty() && one > 0){
            int size=q1.size();
            for(int i=0;i<size;i++){
                int cr[]=q1.poll();
                int r=cr[0];
                int c=cr[1];
                for(int x[]:dir){
                    int nr=r+x[0];
                    int nc=c+x[1];
                    if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 1){
                        grid[nr][nc]=2;
                        q1.add(new int[]{nr,nc});
                        one--;
                    }
                }

            }
            level++;
        }

        if(one==0){
           return level;
        }
        else{
            return -1;
        }
        
    }
}
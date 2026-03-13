class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
    int[][] dir = {
            {1,0},{-1,0},{0,1},{0,-1},
            {1,1},{1,-1},{-1,1},{-1,-1}
        };
        int n=grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1){
            return -1;
        }

        Queue<int[]> q1=new LinkedList<>();
        q1.add(new int[]{0,0});
        grid[0][0]=1;
        int level=1;

        while(!q1.isEmpty()){
             int size = q1.size();

        for(int i=0;i<size;i++){
            int x[]=q1.poll();
            int r=x[0];
            int c=x[1];

            if(r == n-1 && c == n-1)
                    return level;
            for(int d[]:dir){
                int nr=r+d[0];
                int nc=c+d[1];

             if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==0){
                    q1.add(new int[]{nr,nc});
                    grid[nr][nc]=1;
                }
            }
        }
        level++;
            

        }
        return -1;

        

    }

    
}
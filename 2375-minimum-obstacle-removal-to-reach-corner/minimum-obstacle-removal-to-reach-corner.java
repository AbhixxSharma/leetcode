class Solution {
    public int minimumObstacles(int[][] grid) {
       int n=grid.length;
       int m= grid[0].length;

       int dist[][]= new int[n][m];
       PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->a[0]-b[0]);

       for(int i[]:dist){
        Arrays.fill(i,Integer.MAX_VALUE);
       }
       dist[0][0]=0;
       int dr[]={1,-1,0,0};
       int dc[]={0,0,1,-1};
       pq.offer(new int[]{0,0,0});
       while(!pq.isEmpty()){
         int curr[]=pq.poll();
         int cost=curr[0];
         int r=curr[1];
         int c=curr[2];

         if(r==n-1 && c==m-1) return cost;

         for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];

            if(nr<0 || nc<0 || nc>=grid[0].length||nr>=grid.length) continue;

            if(cost+grid[nr][nc]<dist[nr][nc]){
                dist[nr][nc]=cost+grid[nr][nc];

                pq.offer(new int[]{dist[nr][nc],nr,nc});
            }
         }
       }
       return dist[n-1][m-1];
     }
}
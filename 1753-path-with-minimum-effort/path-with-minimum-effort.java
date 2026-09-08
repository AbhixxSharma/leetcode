class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m= heights[0].length;

        int dist[][]= new int[n][m];  
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i[]:dist){
            Arrays.fill(i,Integer.MAX_VALUE);
        }



        dist[0][0]=0;
        pq.offer(new int[]{0,0,0});
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};

        while(!pq.isEmpty()){
            int curr[]= pq.poll();
             int diff=curr[0];
             int r=curr[1];
             int c=curr[2];

             if(r==n-1&& c==m-1)return diff;

             for(int i=0;i<4;i++){
                int nr= r+dr[i];
                int nc= c+dc[i];

                if(nr<0 ||nr>=n|| nc<0||nc>=m) continue;

                int  abs=Math.abs(heights[nr][nc]-heights[r][c]);

                int  max=Math.max(abs,diff);

                if(max<dist[nr][nc]){
                    dist[nr][nc]= max;
                    pq.offer(new int[]{dist[nr][nc],nr,nc});
                }
             }


        }

        return 0;
         


        
    }
}
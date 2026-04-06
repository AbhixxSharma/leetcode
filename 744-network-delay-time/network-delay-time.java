class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<ArrayList<int[]>> lst= new ArrayList<>();
        for(int i=0;i<=n;i++){
            lst.add(new ArrayList<>());
        }
        for(int t[]:times){
            int u=t[0];
            int v=t[1];
            int wt=t[2];
             lst.get(u).add(new int[]{v, wt});
        }

        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->a[1]-b[1]);
        int dist[]= new int[n+1];
         Arrays.fill(dist, Integer.MAX_VALUE);
         dist[k] = 0;
        pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int []curr=pq.poll();
            int u=curr[0];
            int d=curr[1];
            if (d > dist[u]) continue;
            for(int []nei:lst.get(u)){
                int v = nei[0];
                int wt = nei[1];

                if(d+wt<dist[v]){
                    dist[v]=d+wt;
                    pq.add(new int[]{v, dist[v]});

                }
            }
        }
         int maxTime = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, dist[i]);
        }

        return maxTime;
    }
    }

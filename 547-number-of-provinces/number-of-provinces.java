class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> ll= new ArrayList<>();
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        
        for(int i=0;i<isConnected.length;i++){
            ll.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(i!=j && isConnected[i][j]==1){
                    ll.get(i).add(j);
                    ll.get(j).add(i);
                }
            }
        }
        // dfs(visited,isConnected,lst)
        int cnt=0;
        for(int i=0;i<n;i++){
        if(visited[i]==false){
            dfs(i,ll,visited);
            cnt++;

        }
        }

        return cnt;
        
    }

   private void dfs(int val, List<List<Integer>> adj, boolean[] visited) {
        visited[val] = true;

        for (int it : adj.get(val)) {
            if (!visited[it]) {
                dfs(it, adj, visited);
            }
        }
   }
}
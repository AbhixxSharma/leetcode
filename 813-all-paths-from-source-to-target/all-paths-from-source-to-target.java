class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ll= new ArrayList<>();
        List<Integer> lst= new ArrayList<>();
        lst.add(0);
        dfs(graph,ll,lst,0);
        return ll;
        
        
        
    }
    void dfs(int graph[][],List<List<Integer>> ll,List<Integer>lst,int node){
        if(node==graph.length-1){
            ll.add(new ArrayList<>(lst));
            return;
        }

        for(int i:graph[node]){
            lst.add(i);
            dfs(graph,ll,lst,i);
            lst.remove(lst.size()-1);

        }
    }
}
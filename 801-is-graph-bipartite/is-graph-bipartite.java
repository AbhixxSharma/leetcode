class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]= new int[graph.length];
        for(int i=0;i<graph.length;i++){
            color[i]=-1;
        }


      for(int i = 0; i < graph.length; i++){

            if(color[i] == -1){

        Queue<Integer> q= new LinkedList<>();
        q.add(i);
        color[0]=0;
        while(!q.isEmpty()){
            int x=q.remove();

            for(int neigh:graph[x]){
                if(color[neigh]==-1){
                    color[neigh]=1-color[x];
                    q.add(neigh);
                }
                else if(color[neigh]==color[x]){
                    return false;
                }
            }
        }
            }
      }
        return true;


        
    }
}
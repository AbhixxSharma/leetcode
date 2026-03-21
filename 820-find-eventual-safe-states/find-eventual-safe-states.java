class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
         ArrayList<ArrayList<Integer>> lst= new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            lst.add(new ArrayList<>());
        }

       int indegree[]= new int[graph.length];
      for(int i = 0; i < graph.length; i++) {
       for(int nei : graph[i]) {
          lst.get(nei).add(i);  
           indegree[i]++;        
          }
       }
       List<Integer> lst1=new ArrayList<>();
       Queue<Integer> q1= new LinkedList<>();
       for(int i = 0; i < graph.length; i++){
    if(indegree[i] == 0){
        q1.add(i);
    }
}
       while(!q1.isEmpty()){
        int node=q1.poll();
        lst1.add(node);
        for(int nei:lst.get(node)){
            indegree[nei]--;
            if(indegree[nei]==0){
                q1.add(nei);
            }
        }

       }
       Collections.sort(lst1);
       return lst1;


       
    }
}
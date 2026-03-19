class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> lst= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            lst.add(new ArrayList<>());
        }
        int indegree[]= new int[numCourses];
        for(int p[]:prerequisites){
            int a=p[0];
            int b=p[1];
            lst.get(b).add(a);
            indegree[a]++;

        }
        Queue<Integer>q1= new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q1.add(i);
            }
        }
        int topo[]= new int[numCourses];
        int i=0;

        while(!q1.isEmpty()){
            int node=q1.poll();
            topo[i++]=node;

            for(int nei:lst.get(node)){
                indegree[nei]--;

                if(indegree[nei]==0){
                    q1.add(nei);
                }
            }



        }
       if (i != numCourses) {
            return new int[0]; 
        }

        return topo;
    }
}
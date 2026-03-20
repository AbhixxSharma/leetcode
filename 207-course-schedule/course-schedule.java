class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        Queue<Integer> q1= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q1.add(i);
            }
        }
        int cnt=0;
        while(!q1.isEmpty()){
            int node=q1.poll();
            cnt++;
            for(int nei: lst.get(node)){
                indegree[nei]--; 
                if(indegree[nei]==0){
                    q1.add(nei);
                }
            }
        }
       return cnt==numCourses;
    }
}
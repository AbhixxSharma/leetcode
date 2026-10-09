/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        Queue<Node> q1= new LinkedList<>();
        if(root==null) return 0;
        q1.add(root);
        int lvl=0;

        while(!q1.isEmpty()){
            int s=q1.size();
            for(int i=0;i<s;i++){
                Node temp=q1.poll();

                for(Node child:temp.children){
                    if(child!=null){
                        q1.add(child);
                    }
                }
            }
            lvl++;
        }
        return lvl;
        
    }
}
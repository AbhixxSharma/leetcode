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
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ll= new ArrayList<>();
        Queue<Node> q1= new LinkedList<>();
        if(root==null) return ll;
        q1.add(root);
        while(!q1.isEmpty()){
            List<Integer> lst= new ArrayList<>();
            int size= q1.size();
            for(int i=0;i<size;i++){
                Node temp=q1.poll();
                int x=temp.val;
                lst.add(x);
               for (Node child : temp.children) {
                    if (child != null) {
                        q1.add(child);
                    }
                }


            }
            ll.add(lst);

        } 
        return ll;
        
    }
}
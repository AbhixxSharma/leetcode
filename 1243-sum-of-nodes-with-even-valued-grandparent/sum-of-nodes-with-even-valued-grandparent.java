/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
       return sumt(root,null,null);
      
        
    }
    public int sumt(TreeNode node, TreeNode parent, TreeNode grandparent){
        if(node == null) return 0;
        int sum=0;
        if(grandparent!=null && grandparent.val%2==0){
            sum+=node.val;

        }
        sum+=sumt(node.left,node,parent);
        sum+=sumt(node.right,node,parent);

        return sum;
    }
}
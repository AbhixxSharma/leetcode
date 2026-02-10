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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        reverse(root);
        return root;

    }
    public void reverse(TreeNode root){
        if(root==null) return ;

        reverse(root.right);
        sum+=root.val;
        root.val=sum;

        reverse(root.left);
    }







    //     convert(root,root);
    //     return root;
        
    // }
    // public void convert(TreeNode node,TreeNode root){
    //      if (node == null) return;

    //      int greater=summ(root,node.val);
    //      node.val = node.val + greater;

    //      convert(node.left,root);
    //      convert(node.right,root);


    // }
    // public int summ(TreeNode root,int target){
    //     if(root == null) return 0;

    //     int sum = 0;

    //     if (root.val > target) {
    //         sum += root.val;
    //     }

    //     sum += summ(root.left, target);
    //     sum += summ(root.right, target);

    //     return sum;

    
}
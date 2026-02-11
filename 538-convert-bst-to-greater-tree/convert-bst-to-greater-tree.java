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
    public TreeNode convertBST(TreeNode root) {
        reverse(root);
        return root;

    }
    public void reverse(TreeNode root){
        if(root==null){
            return;
        }
        reverse(root.right);
        sum+=root.val;
        root.val=sum;
        reverse(root.left);

    }
}


// public void reverse(TreeNode root){
//         if(root==null) return ;

//         reverse(root.right);
//         sum+=root.val;
//         root.val=sum;

//         reverse(root.left);
//     }
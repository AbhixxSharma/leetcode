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
    public int averageOfSubtree(TreeNode root) {
        int ar[]=new int[1];

        average(root,ar);
        return ar[0];
        
        
    }

     int cnt(TreeNode root){
        if(root==null) return 0;
        int l=cnt(root.left);
        int r=cnt(root.right);
        return l+r+1;
     }
     int sum(TreeNode root){
        if(root==null) return 0;
        return root.val+sum(root.right)+sum(root.left);

     }
     void average(TreeNode root,int arr[]){
        if(root==null) return;
        if(sum(root)/cnt(root)==root.val){
            arr[0]++;
        }
        average(root.left,arr);
        average(root.right,arr);
     }

}
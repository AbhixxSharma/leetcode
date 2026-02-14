/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        findPath(root, p, path1);
        findPath(root, q, path2);
         int i = 0;
        while (i < path1.size() && i < path2.size()) {

            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }

        return path1.get(i-1);
        
    }

    public boolean findPath(TreeNode root,TreeNode target,List<TreeNode> list){
        if(root==null) return false;

        list.add(root);
         if (root == target) return true;

        if(findPath(root.left,target,list)||findPath(root.right,target,list)){
            return true;
        }

        list.remove(list.size()-1);
        return false;
    }
}
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>lst=res(root);
        return convert(lst,0,lst.size()-1);
        
    }

    public TreeNode convert(List<Integer>lst,int st,int end){
        if(st>end)return null;

        int mid=(st+end)/2;
        TreeNode root =new TreeNode(lst.get(mid));
        root.left=convert(lst,st,mid-1);
        root.right=convert(lst,mid+1,end);

        return root;
    }
    public List<Integer> res(TreeNode root){
        List<Integer> lst= new ArrayList<>();
        inoder(root,lst);
        return lst;
    }

    private void inoder(TreeNode root,List<Integer>lst){
        if(root==null){
            return ;
        }
        inoder(root.left,lst);
        lst.add(root.val);
        inoder(root.right,lst);
    }
}
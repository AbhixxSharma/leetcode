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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> q1 = new LinkedList<>();
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        if (root == null) return null;

        int lvl = 1;
        q1.add(root);

        while (!q1.isEmpty()) {
            int s = q1.size();

            for (int i = 0; i < s; i++) {
                TreeNode temp = q1.poll();

                if (depth - 1 != lvl) {
                    if (temp.left != null) {
                        q1.add(temp.left);
                    }

                    if (temp.right != null) {
                        q1.add(temp.right);
                    }
                } else {
                    TreeNode z = new TreeNode(val);
                    TreeNode y = new TreeNode(val);

                    z.left = temp.left;
                    y.right = temp.right;

                    temp.left = z;
                    temp.right = y;
                }
            }

            if (lvl == depth - 1) break;

            lvl++;
        }

        return root;
    }
}
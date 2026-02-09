/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> lst= new ArrayList<>();
        while(head!=null){
            lst.add(head.val);
            head=head.next;
        }
        return convert(lst,0,lst.size()-1);




        
    }
    public TreeNode convert(List<Integer> lst, int st,int end){
        if(st>end) return null;

        int mid=(st+end)/2;

        TreeNode root= new TreeNode(lst.get(mid));

        root.left=convert(lst,st,mid-1);
        root.right=convert(lst,mid+1,end);

        return root;
    }
}
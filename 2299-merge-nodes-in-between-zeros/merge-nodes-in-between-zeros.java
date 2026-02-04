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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        List<Integer> lst= new ArrayList<>();
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            sum+=temp.val;
            if(temp.val==0){
                lst.add(sum);
                sum=0;
            }
            temp=temp.next;
        }
        ListNode Dummy= new ListNode(0);
        ListNode curr=Dummy;
        for(int i:lst){
            if(i==0) continue;
            curr.next = new ListNode(i);
            curr=curr.next;
        }
        return Dummy.next;
        
    }
}
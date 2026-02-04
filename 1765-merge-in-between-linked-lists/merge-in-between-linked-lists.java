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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();

        
        ListNode temp = list1;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        for (int i = b; i >= a; i--) {
            arr.remove(i);
        }
        int id=a;
        ListNode temp2=list2;
        while(temp2!=null){
            arr.add(id,temp2.val);
            id++;
            temp2=temp2.next;
        }
        ListNode xrr=new ListNode(0);
        ListNode curr=xrr;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return xrr.next;

        
    }
}
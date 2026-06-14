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
    public int pairSum(ListNode head) {
       ArrayList<Integer> lst = new ArrayList<>();
       while(head!=null){
        lst.add(head.val);
        head=head.next;
       }
       int max=0;

       int st=0;
       int end=lst.size()-1;
       while(st<=end){
        int sum=lst.get(st)+lst.get(end);
        max=Math.max(max,sum);
        st++;
        end--;
       }
       return max;
        
    }
}
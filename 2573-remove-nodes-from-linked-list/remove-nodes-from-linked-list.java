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
    public ListNode removeNodes(ListNode head) {

        // return head;
       ArrayList<Integer> lst= new ArrayList<>();
        ArrayList<Integer> lst1= new ArrayList<>();
    //    Stack<Integer> st= new Stack<>();
       ListNode temp=head;
       while(temp!=null){
         lst.add(temp.val);
         temp=temp.next;
       }
       int max=Integer.MIN_VALUE;
       for(int i=lst.size()-1;i>=0;i--){
        if (lst.get(i) >= max) {
            lst1.add(lst.get(i));
            max = lst.get(i);
        }
        // while(!st.isEmpty()&&lst.get(i)>=st.peek()){
        //     st.pop();
        // }
        // if(st.isEmpty()){
        //     lst1.add(-1);

        // }
        // else{
        //     lst1.add(st.peek());
        // }
        // st.push(lst.get(i));
       }
       Collections.reverse(lst1);

    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    for (int val : lst1) {
        curr.next = new ListNode(val);
        curr = curr.next;
    }

    return dummy.next;
       
   


        
    }
}
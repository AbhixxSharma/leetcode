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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        List<Integer> lst=new ArrayList<>();
        while(temp!=null){
            lst.add(temp.val);
            temp=temp.next;
            
        }
        int arr[]=new int[lst.size()];
        

        for(int i=0;i<lst.size();i++){
            int ud=0;
            for(int j=i+1;j<lst.size();j++){
                int id=(j);
                if(lst.get(id)>lst.get(i)){
                    ud=lst.get(id);
                    break;
                }
            }
            arr[i]=ud;

        
        }
        return arr;
        
    }
}
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode dummy=head;
        ArrayList<Integer> lst= new ArrayList<>();
        ArrayList<Integer> lst2= new ArrayList<>();
        
        while(dummy!=null){
            lst.add(dummy.val);
            dummy= dummy.next;
        }
        if(lst.size()<=2){
            return new int[]{-1,-1};
        }

        for(int i=0;i<lst.size()-1;i++){
            if(i>0 && lst.size()>2){
                if(((lst.get(i)>lst.get(i-1))&&(lst.get(i)>lst.get(i+1)))||
               ( lst.get(i)<lst.get(i-1)&&(lst.get(i)<lst.get(i+1)))){
                lst2.add(i+1);
                
               }
            }
        }
        if (lst2.size() < 2) {
            return new int[]{-1, -1};
        }
        int arr[]= new int[2];
       
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < lst2.size(); i++) {
            min = Math.min(min, lst2.get(i) - lst2.get(i - 1));
        }

        
        int max = lst2.get(lst2.size() - 1) - lst2.get(0);

        return new int[]{min, max};
        
    }
}
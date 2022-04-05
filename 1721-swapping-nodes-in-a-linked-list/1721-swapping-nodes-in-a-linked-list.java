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
    public ListNode swapNodes(ListNode head, int k) {
        
        
        ListNode kth=head,temp_kth=null,end=head;
        
     k-=1;
        
        
        while(k>0)
        {
            kth=kth.next;
            k--;
        }
        
        temp_kth=kth;
        
        while(temp_kth.next!=null)
        {
            end=end.next;
            temp_kth=temp_kth.next;
        }
        int temp_val=kth.val;
        
        kth.val=end.val;
        end.val=temp_val;
        
        return head;
       
    }
}
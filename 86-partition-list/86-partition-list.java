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
    public ListNode partition(ListNode head, int x) {
      
    ListNode a=new ListNode(0);
        ListNode b=new ListNode(0);
        
        ListNode end=null,curr_a=a,curr_b=b;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                
                curr_a.next=head;
                
                curr_a=curr_a.next;
            }
            
            else
            {
                curr_b.next=head;
                curr_b=curr_b.next;
            }
            head=head.next;
        }
        curr_a.next=b.next;
    curr_b.next=null;
        
    return a.next;
    }
    
    
}
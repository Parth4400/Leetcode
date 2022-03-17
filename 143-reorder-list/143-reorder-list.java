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
    ListNode temp;
    public void recursion(ListNode head)
    {
        if(head==null)
            return ;
       // System.out.println(head.val);
        recursion(head.next);
                //  System.out.println(temp.val);
        ListNode next=temp.next;
        
        temp.next=head;
        head.next=next;
         //System.out.println(temp.val + " " + temp.next.val + " " + temp.next.next.val);
        temp=next;
    
        
        
    }
    public void reorderList(ListNode head) {
        
        temp=head;
        ListNode fast=head.next;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
}
        ListNode val=slow.next;
        //System.out.println(slow.val);
        slow.next=null;
        
       
        
        recursion(val);
       
        
    }
}
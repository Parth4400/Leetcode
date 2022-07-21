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
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
    
        
        if(head==null|| head.next==null)
            return head;
        
     
        
        ListNode temp=head;
       
      
        ListNode prev1=null,prev2=null;
        ListNode l;
        int c=1;
        while(c!=left)
        {
            c++;
            prev1=temp;
           
            temp=temp.next;
        }
        l=temp;
        if(prev1!=null)
        prev1.next=null;
        while(c!=right)
        {c++;
        prev2=temp;  
            temp=temp.next;
        }
        
        prev2=temp.next;
        temp.next=null;
        
        
        reverse(l);
         l.next=prev2;
        if(prev1!=null)
        { 
            prev1.next=temp;
            return head;
        }
        else
            return temp;
       
       
        
        
    }
    public void reverse(ListNode head)
    {
        if(head.next==null)
            return ;
       // System.out.println("l");
        
        ListNode curr=head,next=null,temp=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=temp;
            temp=curr;
            curr=next;
        }
        
        
        //print(head);
        return;
    }
    public void print(ListNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val + " ");
            head=head.next;
        }
        return;
    }
}
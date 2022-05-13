/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty())
        {
            int s=que.size();
           Node prev=null,curr=null; 
            
            for(int i=0;i<s;i++)
            { 
                
           if(i==0){  
               prev=que.poll();
               if(prev.left!=null)
               que.offer(prev.left);
               if(prev.right!=null)
               que.offer(prev.right);
                   }
                else
                { 
             curr=que.poll();
            if(curr.left!=null)
               que.offer(curr.left);
               if(curr.right!=null)
            que.offer(curr.right);
                    prev.next=curr;
                   
                prev=curr;
            }
        }
        }
      return root;  
    } 
}
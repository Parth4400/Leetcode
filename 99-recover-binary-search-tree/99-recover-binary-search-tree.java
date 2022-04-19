/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   TreeNode prev=null; 
    public void helper(TreeNode root,List<TreeNode> list)
    {
        if(root==null)
            return ;
        
        helper(root.left,list);
        if(prev!=null &&  prev.val>root.val)
        {//System.out.println("l");
         list.add(prev);
            list.add(root);
        }
        
        prev=root;
        
        helper(root.right,list);
        
        
    }
    
    public void swap(TreeNode r1,TreeNode r2)
    {
        
        int val=r1.val;
        r1.val=r2.val;
        r2.val=val;
    }
    public void recoverTree(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        
        helper(root,list);
        
        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }
        if(list.size()==2)
        {
            swap(list.get(0),list.get(1));
        }
        else
        {
            swap(list.get(0),list.get(3));
        }
    }
}
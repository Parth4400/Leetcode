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
   // TreeNode right_end=null;
    
    
    public TreeNode flat(TreeNode root)
    {
        
        if(root==null)
            return null;
          if(root.left==null && root.right==null)
        { 
            
            return root;
        }
       
        
       
        
        TreeNode left=flat(root.left);
        TreeNode right=flat(root.right);
       // System.out.println(right_end.val);
        if(left!=null)
        { 
        TreeNode point=left;
        while(point.right!=null)
        {
            point=point.right;
        }
    root.right=left;
        root.left=null;
        point.right=right;
        }
        return root;
        
        
    }
    public void flatten(TreeNode root) {
       
        flat(root);
    }
}
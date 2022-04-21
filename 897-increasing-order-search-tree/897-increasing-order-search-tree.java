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
    
    TreeNode prev=null,r=null;
    public void toLeft(TreeNode root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        
        r=root;
    }
    public void inOrder(TreeNode root)
    {
        if(root==null)
            return ;
        
        inOrder(root.left);
        if(prev!=null)
        {
            root.left=null;
            prev.right=root;
        }
        
        prev=root;
        
        inOrder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        toLeft(root);
       // System.out.println(root.val);
        inOrder(root);
        return r;
    }
}
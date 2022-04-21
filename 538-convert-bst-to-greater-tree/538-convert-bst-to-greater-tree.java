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
    int sum=0;
    
    public void helper(TreeNode root)
    {
        if(root==null)
            return;
        
        helper(root.right);
       
        int temp=root.val;
        root.val=sum+root.val;
             sum+=temp;
       // System.out.println(sum);
        helper(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
       
        helper(root);
        return root;
    }
}
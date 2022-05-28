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
    public int treeHeight(TreeNode root)
    {
        if(root==null)
        { 
            return 0;
        }
        
      
        return 1+ Math.max(  treeHeight(root.left),
                         treeHeight(root.right));
    }
    public int sumDeepest(TreeNode root,int h,int max_h)
    {
        if(root==null)
        { 
            // System.out.println(h);
            return 0;
             
        }
        int l= sumDeepest(root.left,h+1,max_h);
        int r= sumDeepest(root.right,h+1,max_h);
        int curr_sum = l+r;
        if(h==max_h)
            return root.val +curr_sum;
        else if(curr_sum!=0)
            return curr_sum;
        else
            return 0;
            
    }
    public int deepestLeavesSum(TreeNode root) {
        int h=treeHeight(root);
       // System.out.println(h);
        return sumDeepest(root,1,h);
    }
}
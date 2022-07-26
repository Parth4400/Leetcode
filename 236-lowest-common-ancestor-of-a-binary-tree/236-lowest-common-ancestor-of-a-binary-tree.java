/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode pointer=null;
    
    public int lca(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root==null)
            return -1;
        
       int mark_l= lca(root.left,p,q);
        int mark_r=lca(root.right,p,q);
        
        if(mark_l>0 && mark_r>0 || mark_l >0 &&root==p || mark_l>0 && root==q
          ||mark_r>0 && root==p ||mark_r>0 &&root==q)
        {
            pointer=root;
            return -1;
        }
        else if(root==p || root==q)
            return 1;
        else if(mark_l >0 || mark_r>0)
            return 1;
        else
            return -1;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       lca(root,p,q);
        return pointer;
    }
}
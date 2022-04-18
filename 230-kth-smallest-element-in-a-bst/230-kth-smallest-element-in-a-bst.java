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
    int res=0,num=0;
    public void findAns(TreeNode root)
    {
          
        if(root==null)
            return ;
        
        findAns(root.left);
        //System.out.println(root.val +  " " + k);
     num--;
        if(num==0)
        {
            res=root.val;
            
        }
        
    findAns(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        // we can just do inorder traversal and return kth elemet when recurssion is //foldoig up
        num=k;
      findAns(root);
        return res;
    }
}
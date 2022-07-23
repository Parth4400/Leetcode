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
    int index=0;
    public TreeNode helper(int pre[],int inor[],int i,int j)
    {
       if(i>j || index>=pre.length)
           return null;
        
        TreeNode root=new TreeNode(pre[index]);
         if(i==j)
        {
             index++;
            return root;
        }
        
        
        int break_index=-1;
        
        for(int k=i;k<=j;k++)
        {
            if(inor[k]==pre[index])
            {
                break_index=k;
                index++;
                break;
            }
        }
      //  System.out.println(break_index);
        
        root.left=helper(pre,inor,i,break_index-1);
        root.right=helper(pre,inor,break_index+1,j);
        
        return root;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return helper(preorder,inorder,0,inorder.length-1);
    }
}
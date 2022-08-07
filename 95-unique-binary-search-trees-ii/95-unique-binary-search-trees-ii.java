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
    public List<TreeNode> helper(int nums[] ,int i,int j)
    {
        List<TreeNode> res=new ArrayList<>();
      if(i==j)
        {
            res.add(new TreeNode(nums[i]));
            return res;
        }
        
        else  if(i>j)
        { 
            res.add(null);
            return res;
        }
        
        
        for(int index=i;index<=j;index++)
        {
            List<TreeNode> left=helper(nums,i,index-1);
            List<TreeNode> right=helper(nums,index+1,j);
            for(TreeNode p: left)
            {
            
                for(TreeNode q: right)
                {
                    TreeNode root=new TreeNode(nums[index]);
                    root.left=p;
                    root.right=q;
                    res.add(root);
                }
            }
            
            
        }
        return res;
            
    
        
     
     
     
    }
    public List<TreeNode> generateTrees(int n) {
    
        int nums[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            nums[i-1]=i;
        }
        
        return helper(nums,0,n-1);
        
    }
}
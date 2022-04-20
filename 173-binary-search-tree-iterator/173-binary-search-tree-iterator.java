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
class BSTIterator {
List<Integer> in_order;
    ListIterator<Integer> iterator;
          
    public BSTIterator(TreeNode root) {
        in_order=new ArrayList<>();
        inOrder(root,in_order);
        iterator= in_order.listIterator();
        
    }
    
    public void inOrder(TreeNode root,List<Integer> list)
    {
        
        if(root==null)
            return;
        
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    
    public int next() {
        return iterator.next();
    }
    
    public boolean hasNext() {
        return iterator.hasNext();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
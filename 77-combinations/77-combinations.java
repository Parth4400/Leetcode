class Solution {
    public void helper(int nums[]
                       ,int index,int k,
                       List<Integer> curr,List<List<Integer>> res)
        
    {
       if(curr.size()==k)
       {
           res.add(new ArrayList<>(curr));
           return ;
       }
        
        
        for(int i=index;i<nums.length;i++)
        {
            if((nums.length-i +curr.size()>=k))
               { 
            curr.add(nums[i]);
            helper(nums,i+1,k,curr,res);
            curr.remove(curr.size()-1);
               }
        }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res =new ArrayList<>();
        int nums[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            nums[i-1]=i;
        }
        helper(nums,0,k,new ArrayList<>(),res);
        return res;
    }
}
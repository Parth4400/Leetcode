class Solution {
    public void genUniqueSubset(int nums[],int index,List<Integer> curr,
                               List<List<Integer>> res)
    {
        // if(index>=nums.length)
        // {
        //     res.add(new ArrayList<>(curr));
        //     return;
        // }
        int i=index;
        for(;i<nums.length;i++)
        {
            if(i==index || ((i-1>=0) && nums[i-1]!=nums[i]))
            {
                curr.add(nums[i]);
                genUniqueSubset(nums,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
        if(i>=nums.length)
            res.add(new ArrayList<>(curr));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        genUniqueSubset(nums,0,new ArrayList(),res);
        return res;
        
    }
}
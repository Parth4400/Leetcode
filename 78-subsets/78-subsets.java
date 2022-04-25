
class Solution {
    
    public void dfs(int nums[],int i,List<Integer> ans_list,List<List<Integer>> res)
    {
        if(i>=nums.length)
        {  
            res.add(new ArrayList<>(ans_list));
            return;
            
        }
       /// res.add(new ArrayList<>(ans_list));
        ans_list.add(nums[i]);
        dfs(nums,i+1,ans_list,res);
        ans_list.remove(ans_list.size()-1);
        dfs(nums,i+1,ans_list,res);
        
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        
        dfs(nums,0,new ArrayList<Integer>(),res);
        
        //List<List<Integer>> final_res=new ArrayList(res);
        return res;
    }
}
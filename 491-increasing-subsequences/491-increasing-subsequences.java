class Solution {
    List<List<Integer> >res=new ArrayList<>();
    public void dfs(int nums[],int last_num,int index,List<Integer> ele)
    {
        
        
       
          
              if(ele.size()>=2)
            res.add(new ArrayList<>(ele));
          
         
        Set<Integer> set=new HashSet<Integer>();
      for(int i=index;i<nums.length;i++)
      { 
          if(nums[i]>=last_num && (!set.contains(nums[i])))
          { 
              set.add(nums[i]);
            ele.add(nums[i]);
            dfs(nums,nums[i],i+1,ele);
            ele.remove(ele.size()-1);
          
          }
                
      }
            
        
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
       // Arrays.sort(nums);
        dfs(nums,-101,0,new ArrayList<>());
        return res;
    }
}
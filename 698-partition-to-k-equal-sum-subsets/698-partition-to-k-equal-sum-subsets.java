class Solution {
    public boolean dfs(int nums[],int k,int target,int index,int grp_id,boolean visited[],int curr_sum)
    {
        if(grp_id==k-1)
        { 
            return true;
        }
        
        if(curr_sum==target)
        {//System.out.println("l");
            return dfs(nums,k,target,0,grp_id+1,visited,0);
        }
        if(curr_sum>target)
            return false;
        for(int i=index;i<nums.length;i++)
        {
            if(i>0 && nums[i-1]==nums[i]&& !visited[i-1])
            {
              //  System.out.println("o");
                continue;
            }
            if(!visited[i] )
            {//System.out.println("OP");
                visited[i]=true;
               if(   dfs(nums,k,target,i+1,grp_id,visited,curr_sum+nums[i]))
                   return true
                   ;
            visited[i]=false;
            }
        }
        return false;
    }
            public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;;
                Arrays.sort(nums);
                for(int i=0;i<nums.length;i++)
                    sum+=nums[i];
                
                if(sum%k!=0)
                    return false;
                return dfs(nums,k,sum/k,0,0,new boolean[nums.length],0);
    }
}
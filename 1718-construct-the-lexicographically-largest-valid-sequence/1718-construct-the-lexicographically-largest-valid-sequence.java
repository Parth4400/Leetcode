class Solution {
    List<Integer> res=new ArrayList<>();
    public boolean validPermu(int nums[],int index,boolean visited[],
                              HashMap<Integer,Integer> pair,List<Integer> ele)
    {
        if(ele.size()==(nums.length-1)*2-1)
        {
            res=new ArrayList<>(ele);
            return true;
        }
        if(pair.containsKey(index))
        {
            ele.add(pair.get(index));
            boolean valid= validPermu(nums,index+1,visited,pair,ele);
            ele.remove(ele.size()-1);
            
            return valid;
        }
        // trying option to put in current position
        for(int i=1;i<nums.length;i++)
        {
            if(!visited[nums[i]] &&(nums[i]==1 || nums[i]+index<((nums.length-1)*2) &&                                           !pair.containsKey(nums[i]+index)))
            { 
            ele.add(nums[i]);
            visited[nums[i]]=true;
                if(nums[i]!=1)
                pair.put(index+nums[i],nums[i]);
        if(validPermu(nums,index+1,visited,pair,ele))
            return true;
                
                ele.remove(ele.size()-1);
                visited[nums[i]]=false;
                if(nums[i]!=1)
                pair.remove(index+nums[i]);
        }
           }
        
        return false;
        
    }
    public int[] constructDistancedSequence(int n) {
        
        
        int ans[]=new int [n*2-1];
        int nums[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            nums[i]=n-i+1;
        }
        validPermu(nums,1,new boolean[n+1],new HashMap<>(),new ArrayList<>() );
        
        for(int i=0;i<res.size();i++)
            ans[i]=res.get(i);
        
        return ans;
        
    }
}
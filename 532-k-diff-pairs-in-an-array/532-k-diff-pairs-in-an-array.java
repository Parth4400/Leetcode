class Solution {
    public int findPairs(int[] nums, int k) {
        
   HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
        }
        
        int ans=0;
        for(int v : map.keySet())
        {
            if(k==0  )
            {
                if(map.get(v)>=2)
                ans++;
            }
            else 
            {
                if(map.containsKey((v+k)))
                ans++;
            }
        }
        return ans;
    }
}
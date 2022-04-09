class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int res[]=new int[k];
       PriorityQueue<int[]> que=new PriorityQueue<>((a,b)-> a[1]-b[1]);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key :map.keySet())
        {
            /*
            1-3 ,2-2 3-1
            */
            if( que.size()<=k)
            {
                que.offer(new int[]{key,map.get(key)});
            }
            else
            {
                int to_be_rep[] =que.poll();
                if(to_be_rep[1]<map.get(key))
                {
                    que.offer(new int[]{key,map.get(key)});
                }
                else
                    que.offer(to_be_rep);
                
            }
        }
        if(que.size()>k)
        que.poll();
        //stem.out.println(que);
        int index=0;
        for(int arr[] :que)
        {
            res[index]= arr[0];
            index++;
                
        }
        return res;
        
    }
}
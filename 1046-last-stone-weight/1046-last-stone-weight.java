class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que=new PriorityQueue<>((a,b)-> b-a);
        
        for(int s : stones)
            que.offer(s);
        while(que.size()>1)
        {
            int val1=que.poll();
            int val2=que.poll();
            
            if(val1!=val2){ 
            que.offer(val1-val2);
            }
        //System.out.println(que);
        }
        
        
        return que.isEmpty()?0:que.poll();
        
        
        
    }
}
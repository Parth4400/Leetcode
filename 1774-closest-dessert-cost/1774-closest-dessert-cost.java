class Solution {
    int tot_cost[]=new int[2];
    public void dfs(int cost[],int index,int calc,int t)
    {
        //System.out.println(calc);
        int differ=Math.abs(calc-t);
        if(differ<=tot_cost[1])
        {
          
            if(differ<tot_cost[1])
                tot_cost[0]=calc;
            if(differ==tot_cost[1])
            tot_cost[0]=Math.min(tot_cost[0],calc);
            
              tot_cost[1]=differ;
        }
        if(index>=cost.length|| calc>=t)
            return ;
       
        for(int i=0;i<3;i++)
        {
      int  top_cost=    cost[index]*i;
            dfs(cost,index+1,calc+top_cost,t);
        }
    }
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        tot_cost[0]=Integer.MAX_VALUE;
        tot_cost[1]=Integer.MAX_VALUE;
        for(int i=0;i<baseCosts.length;i++)
        {
            dfs(toppingCosts,0,baseCosts[i],target);
        }
       // System.out.println(tot_cost[1]);
        return tot_cost[0];
    }
}
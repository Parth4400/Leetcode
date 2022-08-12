class Solution {
    int res=0;
    public void dfs(int g[][],int i,int j,int curr_sum)
    {
        if(i<0 || i>=g.length || j<0|| j>=g[i].length || g[i][j]==0 )
        {
           // System.out.println("L");
            return;
        }
        
        curr_sum+=g[i][j];
        //System.out.println(curr_sum);
        res=Math.max(res,curr_sum);
    int temp=g[i][j];
        g[i][j]=0;
        
        dfs(g,i+1,j,curr_sum);
        dfs(g,i,j+1,curr_sum);
        dfs(g,i-1,j,curr_sum);
        dfs(g,i,j-1,curr_sum);
        
        g[i][j]=temp;
        
    }
    public int getMaximumGold(int[][] grid) {
        
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]!=0)
                {
                   // System.out.println("o");
                    dfs(grid,i,j,0);
                    
                }
            }
        }
        
        return res;
    }
}
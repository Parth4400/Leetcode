class Solution {
    int res=0;
    public void dfs(int grid[][],int i,int j,int count,int curr_count)
    {
        
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]==-1)
            return ;
       
        // if(curr_count==count )
        //     System.out.println(i + " "+ j + " " + curr_count);
        
        if(grid[i][j]==2 && curr_count==count)
            res++;
         if(grid[i][j]==0)
            curr_count+=1;
        int temp=grid[i][j];
        grid[i][j]=-1;
        
       
        dfs(grid,i+1,j,count,curr_count);
        dfs(grid,i,j+1,count,curr_count);
        dfs(grid,i-1,j,count,curr_count);
        dfs(grid,i,j-1,count,curr_count);
        grid[i][j]=temp;
    }
    public int uniquePathsIII(int[][] grid) {
       
        int emty_spc=0;
        int srt_i=0,srt_j=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==0)
                    emty_spc++;
                if(grid[i][j]==1)
                {
                    srt_i=i;srt_j=j;
                }
            }
        }
      //  System.out.println(emty_spc);
        dfs(grid,srt_i,srt_j,emty_spc,0);
        return res;
        
        
        
    }
}
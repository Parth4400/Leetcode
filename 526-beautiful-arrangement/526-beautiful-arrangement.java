class Solution {
    // as n<=15 we can use bit-mask
    public int dfs(int n,int index,int mask)
    {
        if(index==n)
            return 1;
        
        int ans=0;
        for(int i=0;i<n;i++)
        { 
        if( (mask &(1<<i))==0 && ((i+1)%(index+1)==0 || (index+1)%(i+1)==0))
        {
           mask= mask|(1<<i);
           ans+= dfs(n,index+1,mask);
            mask=mask^(1<<i);
            
          
        }
        }
        return ans;
    }
    public int countArrangement(int n) {
     // System.out.println(1<<1);
     //  System.out.println(1<<2);
        return dfs(n,0,0);
    }
}
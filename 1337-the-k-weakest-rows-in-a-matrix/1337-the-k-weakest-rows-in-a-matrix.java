class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[]=new int[k];
       int res[][]=new int[mat.length][2]; 
        
        for(int i=0;i<mat.length;i++)
        {int sol=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                    sol++;
            }
         
         res[i][0]=sol;
         res[i][1]=i;
        }
        
        Arrays.sort(res,(a,b)-> a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        // for(int i=0;i<mat.length;i++)
        // System.out.println(Arrays.toString(res[i]));
        for(int i=0;i<k;i++)
        {
            ans[i]=res[i][1];
        }
        return ans;
    }
}
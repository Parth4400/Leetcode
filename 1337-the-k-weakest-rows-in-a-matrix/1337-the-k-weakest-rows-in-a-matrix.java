class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
     //   
        int r=mat.length,c=mat[0].length;
        
        PriorityQueue<int []> que=new PriorityQueue<>((a,b)-> a[0]==b[0]? b[1]-a[1]:b[0]-a[0]);
        int sol=0;
        int res[]=new int[k];
        for(int i =0;i<r;i++)
        {  sol=0;
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==1)
                    sol++;
            }
         
         if(que.size()>=k)
         {
//               PriorityQueue<int []> que1=new PriorityQueue<>(que);
//              for(int p=0;p<que.size();p++)
//                  System.out.println(Arrays.toString(que1.poll()));
             
//              System.out.println("---------------");
             int ele[]=que.poll();
       //       System.out.println(Arrays.toString(ele));
             if(sol<ele[0])
             {
                 que.offer(new int[]{sol,i});
             }
             else
            que.offer(ele);
         }
         else
             que.offer(new int[]{sol,i});
        }
        
        
    
    for(int i=0;i<k;i++)
    {
res[k-i-1]=que.poll()[1];
    }
    
    return res;
    }
}
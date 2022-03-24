class Solution {
    public int numRescueBoats(int[] p, int limit) {
        
        int res=0,l=p.length;
        
        Arrays.sort(p);
        
       int i=0,j=l-1;
        
        while(i<j)
        {
            
            if(p[i]+p[j]<=limit)
            {
                i++;j--;
            }
            else 
            {
                j--;
            }
            res++;
        }
        
        return i==j?res+1:res;
    }
}
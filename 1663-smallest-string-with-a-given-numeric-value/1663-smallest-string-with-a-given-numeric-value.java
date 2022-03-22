class Solution {
    public String getSmallestString(int n, int k) {
       
        
        int max_possi,i=n-1;
            
          char res[]=new char[n];
        
        
        while(i>=0)
        {
          if(  (k-i)>26)
          { 
                res[i]='z';
              k-=26;
          }
            
            
            else
            {
                res[i]=(char)('a' + (k-i)-1);
                k=i;
            }
          i--;  
        }
        
        return new String(res);
        
        
        
        
        
    }
}
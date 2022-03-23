class Solution {
    public int brokenCalc(int s, int t) {
      if( s==t)
         return 0;
        else if(s>t)
         return s-t;
        
   
        if(t%2==0)
            return brokenCalc(s,t/2)+1;
            else
                return brokenCalc(s,t+1)+1;
        
       
      
          
            
        
        
       
        
        }
}
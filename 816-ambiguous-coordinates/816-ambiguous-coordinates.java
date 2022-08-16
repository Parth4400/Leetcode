class Solution {
    public List<String> ambiguousCoordinates(String s) {
    //(  (01)     )    
        List<String> res=new ArrayList<>();
        for(int i=2;i<s.length()-1;i++)
        {
            String left=s.substring(1,i);
            String right=s.substring(i,s.length()-1);
                           // System.out.println(left);
             //  System.out.println(right);
           
            List<String> x=validXY(left);
            List<String> y=validXY(right);
              
                for(String x_coordi : x)
                {
                    for(String y_coordi : y)
                    {
                        
                        res.add('(' +  x_coordi+ ", " + y_coordi  + ')');
                    }
                }
                
                
                
        }
       return res; 
    }
     
    
    
    
    public List<String> validXY(String s)
    {
       
        List<String> coordi=new ArrayList<>();
        
        
        for(int i=1;i<s.length();i++)
        {  
            String valid_left=s.substring(0,i);
            String valid_right=s.substring(i);
           
            if(isLeft(valid_left) && isRight(valid_right))
                coordi.add(valid_left +'.' + valid_right);
        }
        
        if(isLeft(s))
            coordi.add(s);
        
        return coordi;
        
    }
    
    
    public boolean isLeft(String s)
    {
        if(s.length()==1)
            return true;
        
        else
            return s.charAt(0)=='0'?false: true;
        
    }
    public boolean isRight(String s)
    {
        return s.charAt(s.length()-1)!='0';
    }
}
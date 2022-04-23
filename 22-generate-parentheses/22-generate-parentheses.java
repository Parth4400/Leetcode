class Solution {
    public void helper(int n,StringBuilder sb,
                      List<String> res,int open_c,int close_c,int tot)
    {
        if(n==0)
        {
            res.add(sb.toString());
            return ;
        }
        // 2 choices
        if( sb.charAt(sb.length()-1)=='(' )
        {
            if(open_c<tot)
            { 
            sb.append('(');
            helper(n-1,sb,res,open_c+1,close_c,tot);
             sb.deleteCharAt(sb.length()-1);     
            }
           
            
            sb.append(')');
            helper(n-1,sb,res,open_c,close_c+1,tot);
             sb.deleteCharAt(sb.length()-1);
            
        }
        else
        {
            
           if(open_c-close_c>=1)
           { 
            sb.append(')');
        helper(n-1,sb,res,open_c,close_c+1,tot);
                 sb.deleteCharAt(sb.length()-1);
           }
            
           if(open_c<tot)
           { 
                sb.append('(');
                helper(n-1,sb,res,open_c+1,close_c,tot);
                sb.deleteCharAt(sb.length()-1);
           }
            
        }
        
       
    }
    public List<String> generateParenthesis(int n) {
        int ck=n;
 n=n*2;
      
        //["((((((","((((()","(((())","((()))","(())))","()))))"]
        StringBuilder sb=new StringBuilder("(");
      //  System.out.println();
        List<String> res=new ArrayList<>();
        helper(n-1,sb,res,1,0,ck);
        return res;
    }   
}
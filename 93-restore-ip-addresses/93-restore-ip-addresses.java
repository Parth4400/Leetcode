class Solution {
    
    
    public void genAll(String s,StringBuilder sb,int index,int c,
                      List<String> res)
    {
        if(c==3 )
        {
             String last=s.substring(index);
            if(!validNum(last))
                return;
            
            int l=last.length();
            
            sb.append(last);
            res.add(sb.toString());
            sb.delete(sb.length()-l,sb.length());
            return;
        }
       
        StringBuilder local=new StringBuilder();
       
        for(int i=index;i<s.length();i++)
        {
            char ch=s.charAt(i);
           
               // System.out.println(sb + "LL");
            local.append(ch);
            sb.append(ch);
            if( !validNum(local.toString()) ||i==s.length()-1)
            {int l=local.length();
             sb.delete(sb.length()-l,sb.length());
                //System.out.println(local);
                return ;
            }
            
            sb.append('.');
            genAll(s,sb,i+1,c+1,res);
            sb.deleteCharAt(sb.length()-1);
            }
            
        }
    
        
    public boolean validNum(String s)
    {
       // System.out.println(s);
        if(s.length()==0 || s.length()>3 )
            return false;
        else if((s.charAt(0)=='0'&& s.length()>1) || Integer.parseInt(s)>255)
            return false;
        else
            return true;
    }
    public List<String> restoreIpAddresses(String s) {
         List<String> res=new ArrayList<>();
        genAll(s,new StringBuilder(),0,0,res);
        return res;
    }
}
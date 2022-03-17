class Solution {
    public int scoreOfParentheses(String s) {
        
        if(s.equals("()"))
            return 1;
       int ans =0;
        
        int check=0,j=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                check++;
            else 
                check--;
            
            if(check==0)
            {
               String paren=s.substring(j+1,i);
                if(paren.equals(""))
                    ans+=1;
                else
                    ans+=2*scoreOfParentheses(paren);
                j=i+1;
            }
            
        }
        return ans;
    }
}
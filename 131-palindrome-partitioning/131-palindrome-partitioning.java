class Solution {
    
    public boolean isPalin(StringBuilder s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public void genAll(String s,int index,List<String> curr,
                       List<List<String>> res)
    {
        if(index>=s.length())
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=index;i<s.length();i++)
        {
            char ch=s.charAt(i);
            sb.append(ch);
            if(!isPalin(sb))
            {
            continue;
            }
            curr.add(sb.toString());
            genAll(s,i+1,curr,res);
            curr.remove(curr.size()-1);
            
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        genAll(s,0,new ArrayList<>(),res);
        return res;
    }
}
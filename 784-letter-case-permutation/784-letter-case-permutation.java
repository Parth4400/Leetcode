class Solution {
    List<String> res=new ArrayList<>();
    public void dfs(char arr[],int index,StringBuilder sb)
    {
        if(index>=arr.length)
        {
          res.add(sb.toString());  
            return ;
        }
        
        
        char ch=arr[index];
        if(Character.isLetter(ch) )
        {
           
          
                sb.append(Character.toLowerCase(ch));
                dfs(arr,index+1,sb);
                sb.deleteCharAt(sb.length()-1);
            sb.append(Character.toUpperCase(ch));
            dfs(arr,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        
            
           
        }
        else
        {sb.append(ch);
            dfs(arr,index+1,sb);
        
         sb.deleteCharAt(sb.length()-1);
        }
        
       
        
        
       
            
    }
    public List<String> letterCasePermutation(String s) {
        dfs(s.toCharArray(),0,new StringBuilder());
        return res;
        
    }
}
class Solution {
    int res=0;
    public void dfs(List<String> arr,int index,int curr_len,int fre[],String s)
    {
        if(index>=arr.size())
        {//System.out.println(s);
            res=Math.max(res,curr_len);
            return;
        }
      boolean unique=true;
       String curr_str=arr.get(index); 
        int copy_fre[]=new int [26];
        for(int i=0;i<26;i++)
            copy_fre[i]=fre[i];
        //System.out.println(Arrays.toString(fre));
        for(int i=0;i<curr_str.length();i++)
        {
            char ch=curr_str.charAt(i);
           // System.out.println(ch);
             fre[ch-'a']++;
            if(fre[ch-'a']>1)
            {
            //System.out.println("LL");
                unique=false;
                break;
            }
           
        }
            if(unique)
            {
                dfs(arr,index+1,curr_len+curr_str.length(),fre,s+curr_str);
            
            }
            
            dfs(arr,index+1,curr_len,copy_fre,s);
        
    }
    public int maxLength(List<String> arr) {
        dfs(arr,0,0,new int[26],"");
        return res;
    }
}
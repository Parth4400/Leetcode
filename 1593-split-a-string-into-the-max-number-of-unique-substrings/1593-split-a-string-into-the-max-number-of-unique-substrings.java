class Solution {
    int res=0;
    public void dfs(char arr[],int index,Set<String> set,int curr)
    {
        if(index>=arr.length)
        {res=Math.max(res,curr);
        // System.out.println(set);
            return ;
        }
        
        String s="";
        for(int i=index;i<arr.length;i++)
        {
            s=s+arr[i];
            if(!set.contains(s))
            {
                set.add(s);
                dfs(arr,i+1,set,curr+1);
                set.remove(s);
            }
        }
    }
    public int maxUniqueSplit(String s) {
        dfs(s.toCharArray(),0,new HashSet<>(),0);
        return res;
    }
}
class Solution {
    int res=0;
    public void dfs(char arr[],int index,List<Character> list)
    {
        
        res++;
       
   // System.out.println(list);
        
        Set<Character> set=new HashSet<>();
        for(int i=index;i<arr.length;i++)
        {
            if(i==index || !set.contains(arr[i]))
            {
                set.add(arr[i]);
                swap(arr,index,i);
                 list.add(arr[index]);
                dfs(arr,index+1,list);
                list.remove(list.size()-1);
                swap(arr,index,i);
            }
        }
    }
    public void swap(char arr[],int i,int j)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
    public int numTilePossibilities(String tiles) {
        dfs(tiles.toCharArray(),0,new ArrayList<Character>());
        return res-1;
    }
}
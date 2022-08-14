class Solution {
    int max_val=Integer.MAX_VALUE;
    List<Integer> res=new ArrayList<>();
    public boolean dfs(char arr[],int index,List<Integer> curr_ele)
    {
        if(index>=arr.length && curr_ele.size()>=3)
        {
            res=new ArrayList<>(curr_ele);
            return true;
        }
        if(index>=arr.length)
            return false;
    
        
        long num=0;
        int s=curr_ele.size(),a=-1,b=-1;
        if(s>=2)
        {
            a=curr_ele.get(s-1);
            b=curr_ele.get(s-2);
        }
        
        for(int i=index;i<arr.length;i++)
        {
           
        num=num*10 + (arr[i]-'0');
            //System.out.println(num);
            if(num>max_val)
                return false;
            
            if(a==-1||b==-1 ||  a+b==num )
            {
                curr_ele.add((int)num);
                boolean fibo_seq=dfs(arr,i+1,curr_ele);
                    
                    if(fibo_seq)
                        return true;
                    curr_ele.remove(curr_ele.size()-1);
            }
            if(num==0)
                return false;
            
            
           
        }
        
        return false;
    }
    public List<Integer> splitIntoFibonacci(String num) {
        
        dfs(num.toCharArray(),0,new ArrayList<>());
        return res;
    }
}
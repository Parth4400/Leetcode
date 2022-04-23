class Solution {
   public void helper(int c[],int target,List<List<Integer>> res,
                      List<Integer> curr,int index,int sum)
   {
       if(sum==target)
       {
           res.add(new ArrayList<>(curr));
           return ;
       }
       if(sum>target || index>=c.length)
       {
           return ;
       }
       
      for(int i=index;i<c.length;i++)
      { 
          
          if(i==index || (i-1)>=0 && c[i-1]!=c[i])
          { 
    curr.add(c[i]);
           
       helper(c,target,res,curr,i+1,sum+c[i]);
       curr.remove(curr.size()-1);
          }
      
   }
   }
    public List<List<Integer>> combinationSum2(int[] c, int t) {
      Arrays.sort(c);
        List<List<Integer>> res=new ArrayList<>();
         
        
        helper(c,t,res,new ArrayList<>(),0,0);
         //List<List<Integer>> ans=new ArrayList<>(res);
        return res;
    }
}
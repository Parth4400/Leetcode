class Solution {
    public void buildAns(int num,int n,int k,int s,List<Integer> curr,
                         List<List<Integer>> res)
    {
        if(k==0)
        {
            //System.out.println("ll" + curr);
            if(s==n){
               // System.out.println("l" + curr);
                res.add(new ArrayList<>(curr));
            }
            
            return;
        }
        if(num>9 ){
            //System.out.println("greater tahn 9");
            return;
        }
        curr.add(num);
        buildAns(num+1,n,k-1,s+num,curr,res);
        curr.remove(curr.size()-1);
        buildAns(num+1,n,k,s,curr,res);
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> res=new ArrayList<>();
        buildAns(1,n,k,0,new ArrayList<>(),res);
        return res;
    }
}
class Solution {
  
    public void recursion(int nums[],List<List<Integer>> res,int index)
    {
        if(index==nums.length)
        { 
           List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                list.add(nums[i]);
            }
            //List al = Arrays.asList(nums);
            res.add(list);
                return ;
            }
        
        for(int i=index;i<nums.length;i++)
        {
           
            swap(nums,index,i);
              
          
            recursion(nums,res,index+1);
               swap( nums,i,index);
                
                
        }
    }
public void swap(int nums[],int i,int j)
{
int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
    
    public List<List<Integer>> permute(int[] nums) {
          List<List<Integer>> res=new ArrayList<>();
       // HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
     recursion(nums,res,0);
        
        return res;
        
    }
}
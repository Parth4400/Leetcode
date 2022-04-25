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
       Set<Integer> set=new HashSet<>(); 
        for(int i=index;i<nums.length;i++)
        {
           
            if(!set.contains(nums[i]))
            { 
             set.add(nums[i]);
                // System.out.println("l");
            swap(nums,index,i);
              
          
            recursion(nums,res,index+1);
               swap( nums,index,i);
            }
                
        }
    }
public void swap(int nums[],int i,int j)
{
int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
          List<List<Integer>> res=new ArrayList<>();
       // HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
     recursion(nums,res,0);
        
        return res;
        
    }
}
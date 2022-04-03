class Solution {
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;
        
        int i=n-2;
        
        while(i>=0 && nums[i]>=nums[i+1] )
            i--;
        
        if(i<0)
        { 
            reverse(nums,0,n);
            return ;
            }
        else
        {// 1,2,3,19,18,16,15,14,13,6,2
         //    6                   3
            int index= nextGreater(nums,nums[i],i+1,n);
            int temp=nums[index];
           nums[index]= nums[i];
               nums[i]=temp;
            reverse(nums,i+1,n);
            return ;
        }
        
    }
    
    
    public int nextGreater(int nums[],int num,int i,int n)
    {
        
        while(i<n && nums[i]>num)
            i++;
        
        return i-1;
        
        
     }
    
    public void reverse(int nums[],int in,int n)
    {
     int i=in,j=n-1;
        
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            i++;
        }
    }
}
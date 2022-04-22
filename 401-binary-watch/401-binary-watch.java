
class Solution {
    
    public void helper(int nums[],int index,int sum, List<Integer> curr,
            boolean is_hour,List<List<Integer>> res )
    {
        if(index>=nums.length)
        {
            res.add(new ArrayList<>(curr));
            return ;
        }
        
       
       

      sum=sum+nums[index];
        
        if((sum>11 && is_hour ) || (sum >=60 && is_hour==false))
        {
            helper(nums,index+1,sum-nums[index],curr,is_hour,res);
        }
        else
        {
            curr.add(nums[index]);
          helper(nums,index+1,sum,curr,is_hour,res);
            curr.remove(curr.size()-1);
            sum-=nums[index];
            helper(nums,index+1,sum,curr,is_hour,res);
        }
    
        
       
       
    }
    public List<String> readBinaryWatch(int t) {
        if(t==0)
        { 
            List<String> l= new ArrayList<>();
            l.add("0:00");
            return l;
        }
        int min[]={1,2,4,8,16,32};
        int hr[]={1,2,4,8};
        
        List<List<Integer>> min_l=new ArrayList<>();
            helper(min,0,0,new ArrayList(),false,min_l);
        List<List<Integer>> hr_l=new ArrayList<>();
        helper(hr,0,0,new ArrayList(),true,hr_l);
       // System.out.println(hr_l);
        
        HashMap<Integer,List<List<Integer>> >hr_m=new HashMap<>();
        HashMap<Integer,List<List<Integer>>> min_m=new HashMap<>();
        
        
        for(List<Integer> l :min_l)
        {
            min_m.putIfAbsent(l.size(),new ArrayList<>());
            min_m.get(l.size()).add(l);
            
        }
        for(List<Integer> l :hr_l)
        {
            hr_m.putIfAbsent(l.size(),new ArrayList<>());
            hr_m.get(l.size()).add(l);
            
        }
   //  System.out.println(hr_m)   ;
    int i=0,j=t;
        List<String> res=new ArrayList<>();
        while(i<=t)
        {
             
            for(List<Integer> hrs : hr_m.getOrDefault(i,new ArrayList<>()))
            {
                for(List<Integer> mins : min_m.getOrDefault(j,new ArrayList<>()))
                {
                    res.add(formTime(hrs,mins));
                }
            }
            
            i++;j--;
        }
        return res;
    }
    
   public String formTime(List<Integer> hr,List<Integer> min)
   {
       StringBuilder time=new StringBuilder();
       int sum=0;
       for(int num : hr)
           sum+=num;
       
       if(hr.size()==0 || sum==0 )
           time.append("0:");
           else
               time.append(String.valueOf(sum) + ":");
       sum=0;
       for(int num :min)
           sum+=num;
       
       if(sum==0 || min.size()==0)
           time.append("00");
       else if(sum<10)
           time.append("0"+ String.valueOf(sum));
       else
           time.append(String.valueOf(sum));
       
       return time.toString();
   }
}
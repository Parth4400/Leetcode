class Solution {
    int val=Integer.MAX_VALUE;
    public boolean splitString(char arr[],int index,long num,int counter)
    {
        if(index>=arr.length && counter>=2)
            return true;
        
        
        long curr_num=0;
        int i=index;
        for(;i<arr.length;i++)
        {
            curr_num=10*curr_num +(arr[i]-'0');
            
        //  System.out.println(curr_num);
         if(( num==-1 ||num-curr_num==1) &&       splitString(arr,i+1,curr_num,counter+1))
              return true;
        }
        
     
        
        return false;
    }
    public boolean splitString(String s) {
        return splitString(s.toCharArray(),0,-1,0);
    }
}
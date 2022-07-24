class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int remain=n,steps=1;
        boolean left=true;
        
        // 1 2 3 4 5 6 7 8 9 10
        //2 4 6 8
        //2 6
        //
        //
        while(remain>1)
        {
            if(left ||remain%2==1 )
            {
               head=head+steps;  
            }
           
            left=!left;
            steps=steps*2;
            remain=remain/2;
        }
        
        return head;
    }
}
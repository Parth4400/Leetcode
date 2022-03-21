class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> list=new ArrayList<>();
        int last_index[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            last_index[ch-'a']=i;
        }
        
        
        int reach=0,srt=0,beg=0;
        
        while(srt<s.length())
        {
            char ch=s.charAt(srt);
            reach=Math.max(reach,last_index[ch-'a']);
            
            if(reach==srt)
            {
                list.add(srt-beg+1);
                beg=srt+1;
            }
            srt++;
        }
        
        return list;
    }
}
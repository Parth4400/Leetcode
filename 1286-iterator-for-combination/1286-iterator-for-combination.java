class CombinationIterator {

    List<String> combi;
    int i;
public    CombinationIterator()
    {
    i=0;
    combi=new ArrayList<>();
    }
    public void findCombi(char arr[],int index,int max_l,StringBuilder s)
    {
        if(s.length()==max_l)
            combi.add(s.toString());
        if(s.length()>max_l)
            return;
        
       
        for(int i=index;i<arr.length;i++)
        {
            s.append(arr[i]);
            findCombi(arr,i+1,max_l,s);
            s.deleteCharAt(s.length()-1);
        }
        
        
    }
    public CombinationIterator(String characters, int combinationLength) {
        this();
        findCombi(characters.toCharArray(),0,combinationLength,new StringBuilder());
    }
    
    public String next() {
       

        return combi.get(i++);
    }
    
    public boolean hasNext() {
        return i<combi.size();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
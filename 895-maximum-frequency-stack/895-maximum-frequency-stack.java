class FreqStack {
Map<Integer,Integer> map;
    List<Stack<Integer>> list;
    int max;
    public FreqStack() {
      map=new HashMap<>();
        list=new ArrayList<>();
        max=0;
        list.add(new Stack<>());
        
    }
    
    public void push(int val) {
     map.put(val,map.getOrDefault(val,0)+1);
      
        int fre=map.get(val);
      
       
        // System.out.println(fre + " "+ max);
        if(fre>=list.size())
        {
         list.add(new Stack<>());
            
        }
       // System.out.println(list);
     
         Stack<Integer> curr=list.get(fre);
            curr.push(val);
        
        
     
 
    }
    
    public int pop() {
       int size=list.size();
      
        Stack<Integer> top;
     top=list.get(size-1);
        int x=top.pop();
        if(top.isEmpty()){ 
          
           list.remove(size-1);
        }
        
       
        map.put(x,map.get(x)-1);
        if(map.get(x)==0)
            map.remove(x);
       // System.out.println(val);
        return x;
            
    }
    
   
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
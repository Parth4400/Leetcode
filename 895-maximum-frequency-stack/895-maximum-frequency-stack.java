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
      
        max=Math.max(fre,max);
        // System.out.println(fre + " "+ max);
        if(max==fre)
        {
         list.add(new Stack<>());
            
        }
       // System.out.println(list);
     
         Stack<Integer> curr=list.get(fre);
            curr.push(val);
        
        
     
 
    }
    
    public int pop() {
       
      
        Stack<Integer> top;
        top=list.get(max);
        if(top.isEmpty()){ 
          
            max--;
            top=list.get(max);
        }
        
        int val=top.pop();
        map.put(val,map.get(val)-1);
       // System.out.println(val);
        return val;
            
    }
    
   
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
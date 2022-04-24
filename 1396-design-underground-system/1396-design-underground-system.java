class UndergroundSystem {

    HashMap<Integer,List<String>> trip;
    HashMap<List<String>,List<Integer>> avg_t;
    public UndergroundSystem() {
        trip=new HashMap<>();
        avg_t=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
       trip.putIfAbsent(id,new ArrayList<>());
        trip.get(id).add(stationName);
        trip.get(id).add(t+"");
        
    }
    
    public void checkOut(int id, String stationName, int t1) {
        List<String> source=trip.get(id);
            List<String> t=new ArrayList<>();
        t.add(source.get(0));
        t.add(stationName);
        int time=t1-Integer.parseInt(source.get(1));
        avg_t.putIfAbsent(t,new ArrayList<>());
   List<Integer> calc=     avg_t.get(t);
        
        if(calc.size()==0)
        {
            calc.add(time);calc.add(1);
        }
        else
        {
            calc.set(0,calc.get(0)+time);
            calc.set(1,calc.get(1)+1);
            
        }
         trip.remove(id);
    }
    
    public double getAverageTime(String a, String b) {
        List<String> curr_t=new ArrayList<>(Arrays.asList(a,b));
        List<Integer> calc=avg_t.get(curr_t);
        double aa=calc.get(0);
        double ba=calc.get(1);
        return aa/ba;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
we just need to swap the values
so naively we can iterate two times the list and return the ans
first time find the length of list and second time reach k and n-k node and swap the values
**2nd Approach**
consider    1->2->3->4->5 where k=2
and we have pointer p1 at node 2 so now first set  one pointer  p2 at head and another p3 at node 2 and now while p3.next!=null we move both the pointer p2 and p3
and the the while loop terminates we have both the  pointer p1 and p3 at desired location
so in one iteration we solved the question just by observation
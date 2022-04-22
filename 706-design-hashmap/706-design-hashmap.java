class Node
{
    int key;
    int val;
    Node next;
    Node(int key,int val)
    {
        this.val=val;
        this.key=key;
    }
    Node(int val,Node next)
    {
        this.val=val;
        this.next=next;
    }
}
class MyHashMap {
Node arr[];
    public MyHashMap() {
        arr=new Node[1000];
    }
    
    public void put(int key, int val) {
        int index=key%1000;
        
       Node head=arr[index];
        
        if(head==null)
        {
            arr[index]=new Node(key,val);
        }
        else
        {
            if(!mappingPresent(key,val))
            { 
            Node new_node=new Node(key,val);
            new_node.next=head;
            arr[index]=new_node;
            }
        }
    }
    
    public int get(int key) {
        int index=key%1000;
        
    Node head=arr[index];
        int ans=-1;
        while(head!=null)
        {
            if(head.key==key)
            {
                ans=head.val;
                break;
            }
            head=head.next;
        }
        
        return ans;
        
    }
    
    public void remove(int key) {
        int index=key%1000;
        
        Node prev=arr[index],head=arr[index];
        if(head==null)
            return;
        if(head.key==key)
        {
            arr[index]=head.next;
        }
        else
        { 
            head=head.next;
    while(head!=null)
    {
        if(head.key==key)
        {
            prev.next=head.next;
            break;
        }
        prev=head;
        head=head.next;
    }
        }
    }
    
    
    public boolean mappingPresent(int key,int new_val)
    {
        int index=key%1000;
        
        
        Node head=arr[index];
        
        while(head!=null)
        {
            if(head.key==key)
            {
               head.val=new_val;
                return true;
            }
            head=head.next;
        }
        
        return false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
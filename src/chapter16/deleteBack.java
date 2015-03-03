public int deleteBack() {
    if(front == null)
        throw new NoSuchElementException();
        
    int data;
    
    if(front.next == null) {
        data = front.data;
        front = null;
        return data;
    }
    
    ListNode n = front;
    
    while(n.next.next != null)
        n = n.next;
        
    data = n.next.data;
    n.next = null;
    return data;
}

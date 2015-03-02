public void removeRange(int start, int end) {
    if(start < 0 || end < 0)
        throw new IllegalArgumentException();
    
    if(end == 0) {
        front = front.next;
        return;
    }
    
    ListNode s = front;
    ListNode e = front;
    
    for(int i = 1; i < start; i++)
        s = s.next;
    
    for(int i = 1; i < end; i++)
        e = e.next;
    
    if(start == 0) {
        front = e.next.next;
        return;
    }
    
    s.next = e.next.next;
}

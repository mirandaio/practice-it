public void transferFrom(LinkedIntList second) {
    if(front == null) {
        front = second.front;
        second.front = null;
        return;
    }
    
    ListNode last = front;
    
    while(last.next != null)
        last = last.next;
        
    last.next = second.front;
    second.front = null;
}

public void rotate() {
    if(front == null)
        return;
        
    ListNode last = front;
    
    while(last.next != null)
        last = last.next;
        
    last.next = front;
    front = front.next;
    last.next.next = null;
}

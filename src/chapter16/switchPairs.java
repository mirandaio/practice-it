public void switchPairs() {
    if(front == null || front.next == null)
        return;
        
    ListNode first = front;
    ListNode second = first.next;
    first.next = second.next;
    second.next = first;
    front = second;
    
    ListNode n = first;
    while(n.next != null) {
        first = n.next;
        second = first.next;
        
        if(second == null)
            return;
            
        first.next = second.next;
        second.next = first;
        n.next = second;
        n = first;
    }
}

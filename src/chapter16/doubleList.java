public void doubleList() {
    if(front == null)
        return;
        
    ListNode current = front;
    ListNode prev = front;
    ListNode copy = null;
    ListNode last = null;
    
    while(current != null) {
        ListNode n = new ListNode(current.data);
        
        if(copy == null) {
            copy = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }
        
        prev = current;
        current = prev.next;
    }
    
    prev.next = copy;
}

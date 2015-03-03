public void stutter() {
    if(front == null)
        return;
        
    ListNode current = front;
    
    while(current != null) {
        ListNode n = new ListNode(current.data);
        n.next = current.next;
        current.next = n;
        current = n.next;
    }
}

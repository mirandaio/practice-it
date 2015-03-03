public boolean isSorted() {
    if(front == null)
        return true;
        
    ListNode prev = front;
    ListNode current = prev.next;
    
    while(current != null) {
        if(prev.data > current.data)
            return false;
            
        prev = current;
        current = prev.next;
    }
    
    return true;
}

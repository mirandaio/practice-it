public boolean hasTwoConsecutive() {
    if(front == null)
        return false;
        
    ListNode prev = front;
    ListNode current = prev.next;
    
    while(current != null) {
        if(prev.data + 1 == current.data)
            return true;
            
        prev = current;
        current = prev.next;
    }
    
    return false;
}

public LinkedIntList removeEvens() {
    LinkedIntList evens = new LinkedIntList();
    
    if(front == null)
        return evens;
        
    evens.front = front;
    ListNode last = evens.front;
    front = front.next;
    ListNode prev = null;
    ListNode current = front;
    int i = 1;
    
    while(current != null) {
        if(i % 2 == 0) {
            last.next = current;
            last = current;
            prev.next = current.next;
            current = current.next;
            last.next = null;
        } else {
            prev = current;
            current = prev.next;
        }
        
        i++;
    }
    
    return evens;
}

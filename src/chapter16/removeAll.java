public void removeAll(int val) {
    ListNode prev = null;
    ListNode current = front;
    
    while(current != null) {
        if(current.data == val) {
            if(prev == null) {
                front = current.next;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        } else {
            prev = current;
            current = prev.next;
        }
    }
}

public void set(int index, int value) {
    ListNode current = front;
    
    for(int i = 0; i < index; i++)
        current = current.next;
        
    current.data = value;
}

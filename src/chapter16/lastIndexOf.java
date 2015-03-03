public int lastIndexOf(int val) {
    ListNode current = front;
    int index = -1;
    int i = 0;
    
    while(current != null) {
        if(current.data == val)
            index = i;
            
        current = current.next;
        i++;
    }
    
    return index;
}

public void stretch(int n) {
    if(n <= 0)
        front = null;
        
    ListNode current = front;
    
    while(current != null) {
        int d = current.data;
        ListNode next = current.next;
        
        for(int i = 1; i < n; i++) {
            current.next = new ListNode(current.data);
            current = current.next;
        }
        
        current.next = next;
        current = next;
    }
}

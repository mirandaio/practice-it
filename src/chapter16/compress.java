public void compress(int n) {
    if(front == null)
        return;
        
    ListNode current = front;
    ListNode runner = current;
    int i = 0;
    int sum = 0;
    
    while(current != null) {
        if(i < n && runner != null) {
            sum += runner.data;
            runner = runner.next;
            i++;
        } else {
            current.data = sum;
            current.next = runner;
            current = runner;
            sum = 0;
            i = 0;
        }
    }
}

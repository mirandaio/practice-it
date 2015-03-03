public boolean equals2(LinkedIntList second) {
    ListNode n1 = front;
    ListNode n2 = second.front;
    
    while(n1 != null || n2 != null) {
        if(n1 == null)
            return false;
            
        if(n2 == null)
            return false;
            
        if(n1.data != n2.data)
            return false;
            
        n1 = n1.next;
        n2 = n2.next;
    }
    
    return true;
}

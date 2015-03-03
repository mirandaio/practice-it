public int removeMin(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    int min = s.peek();
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(n < min)
            min = n;
            
        q.add(n);
    }
    
    while(!q.isEmpty()) {
        int n = q.remove();
        
        if(n > min)
            s.push(n);
    }
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    while(!q.isEmpty())
        s.push(q.remove());
        
    return min;
}

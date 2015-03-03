public boolean isConsecutive(Stack<Integer> s) {
    if(s.size() < 2)
        return true;
        
    Queue<Integer> q = new LinkedList<Integer>();
    int next = s.pop();
    q.add(next);
    boolean consecutive = true;
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(n + 1 != next)
            consecutive = false;
            
        next = n;
        q.add(n);
    }
    
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    while(!q.isEmpty())
        s.push(q.remove());
        
    return consecutive;
}

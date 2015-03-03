public void interleave(Queue<Integer> q) {
    if(q.size() % 2 != 0)
        throw new IllegalArgumentException();
        
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    
    for(int i = 0; i < size / 2; i++)
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size / 2; i++)
        s.push(q.remove());
        
    while(!s.isEmpty()) {
        q.add(s.pop());
        q.add(q.remove());
    }
    
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
}

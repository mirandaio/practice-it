public void shift(Stack<Integer> s, int n) {
    Queue<Integer> q = new LinkedList<Integer>();
    int size = s.size();
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size - n; i++)
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < n; i++)
        q.add(q.remove());
        
    while(!q.isEmpty())
        s.push(q.remove());
}

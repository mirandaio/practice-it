public void mirror(Stack<Integer> s) {
    if(s == null)
        throw new IllegalArgumentException();
        
    Queue<Integer> q = new LinkedList<Integer>();
    int size = s.size();
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size; i++) {
        int n = q.remove();
        s.push(n);
        q.add(n);
    }
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size; i++)
        q.add(q.remove());
        
    while(!q.isEmpty())
        s.push(q.remove());
}

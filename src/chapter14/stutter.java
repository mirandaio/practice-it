public void stutter(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
        
    while(!s.isEmpty())
        q.add(s.pop());
                        
    while(!q.isEmpty())
        s.push(q.remove());
                                        
    while(!s.isEmpty())
        q.add(s.pop());
                                                        
    while(!q.isEmpty()) {
        int n = q.remove();
        s.push(n);
        s.push(n);
    }
}

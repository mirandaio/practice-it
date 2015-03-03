public void compressDuplicates(Stack<Integer> s) {
    if(s.size() == 0)
        return;
        
    Queue<Integer> q = new LinkedList<Integer>();
    int ontop = s.pop();
    int count = 1;
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(n == ontop) {
            count++;
        } else {
            q.add(ontop);
            q.add(count);
            count = 1;
            ontop = n;
        }
    }
    
    q.add(ontop);
    q.add(count);
    
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    while(!q.isEmpty())
        s.push(q.remove());
}

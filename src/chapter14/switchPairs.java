public void switchPairs(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
        
    while(!s.isEmpty())
        q.add(s.pop());
                        
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty()) {
        int n1 = s.pop();
                                                            
        if(s.isEmpty()) {
            q.add(n1);
            break;
        }
        
        int n2 = s.pop();
        q.add(n2);
        q.add(n1);
    }
    
    while(!q.isEmpty())
        s.push(q.remove());
}

public Stack<Integer> copyStack(Stack<Integer> s1) {
    Stack<Integer> s2 = new Stack<Integer>();
    Queue<Integer> q = new LinkedList<Integer>();
            
    while(!s1.isEmpty())
        s2.push(s1.pop());
                            
    while(!s2.isEmpty())
        q.add(s2.pop());
                                            
    while(!q.isEmpty()) {
        int n = q.remove();
        s1.push(n);
        s2.push(n);
    }
    
    return s2;
}

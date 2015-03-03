public void splitStack(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    int numNegatives = 0;
            
    while(!s.isEmpty()) {
        if(s.peek() < 0)
            numNegatives++;
        q.add(s.pop());
    }
                                                    
    while(numNegatives > 0) {
        if(q.peek() < 0) {
            s.push(q.remove());
            numNegatives--;
        } else {
            q.add(q.remove());
        }
    }
    
    while(!q.isEmpty())
        s.push(q.remove());
}

public void mirrorHalves(Queue<Integer> q) {
    if(q == null || q.size() % 2 == 1)
        throw new IllegalArgumentException();
        
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();

    // Nested loops but still O(n) time since the outer loop does not depend
    // on the size of the queue
    for(int k = 0; k < 2; k++) {
        for(int i = 0; i < size / 2; i++) {
            int n = q.remove();
            q.add(n);
            s.push(n);
        }
        
        while(!s.isEmpty())
            q.add(s.pop());
    }
}

public void rearrange(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
            
    for(int k = 0; k < 2; k++) {
        for(int i = 0; i < size; i++) {
            if(q.peek() % 2 == 0)
                q.add(q.remove());
            else
                s.push(q.remove());
        }
        
        while(!s.isEmpty())
            q.add(s.pop());
    }
}

public void reorder(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    int count = 0;
    
    for(int i = 0; i < size; i++) {
        int n = q.remove();
        
        if(n < 0) {
            s.push(n);
        } else {
            q.add(n);
            count++;
        }
    }
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < count; i++)
        q.add(q.remove());
}

public void reverseFirstK(int k, Queue<Integer> q) {
    if(q == null || k > q.size())
        throw new IllegalArgumentException();
        
    if(k <= 0)
        return;
        
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    
    for(int i = 0; i < k; i++)
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size - k; i++)
        q.add(q.remove());
}

public void reverseHalf(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
            
    for(int i = 0; i < size; i++) {
        if(i % 2 == 1)
            s.push(q.remove());
        else
            q.add(q.remove());
    }
                                                                
    while(!s.isEmpty()) {
        q.add(q.remove());
        q.add(s.pop());
    }
    
    if(size % 2 == 1)
        q.add(q.remove());
}

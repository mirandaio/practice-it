public void expunge(Stack<Integer> s1) {
    if(s1.size() < 2)
        return;
        
    Stack<Integer> s2 = new Stack<Integer>();
    int ontop = s1.pop();
    s2.push(ontop);
    
    while(!s1.isEmpty()) {
        int n = s1.pop();
        
        if(n >= ontop) {
            s2.push(n);
            ontop = n;
        }
    }
    
    while(!s2.isEmpty())
        s1.push(s2.pop());
}

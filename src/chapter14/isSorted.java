public boolean isSorted(Stack<Integer> s1) {
    if(s1.size() < 2)
        return true;
        
    Stack<Integer> s2 = new Stack<Integer>();
    boolean sorted = true;
    int ontop = s1.pop();
    s2.push(ontop);
    
    while(!s1.isEmpty()) {
        int n = s1.pop();
        
        if(n < ontop)
            sorted = false;
            
        ontop = n;
        s2.push(ontop);
    }
    
    while(!s2.isEmpty())
        s1.push(s2.pop());
        
    return sorted;
}

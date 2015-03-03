public boolean isPalindrome(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    boolean palindrome = true;
                
    for(int i = 0; i < size; i++) {
        int n = q.remove();
        q.add(n);
        s.push(n);
    }
                                                    
    for(int i = 0; i < size; i++) {
        int n1 = q.remove();
        int n2 = s.pop();
        
        if(n1 != n2)
            palindrome = false;
            
        q.add(n1);
    }
    
    return palindrome;
}

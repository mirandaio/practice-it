public int digitMatch(int n1, int n2) {
    if(n1 < 0 || n2 < 0)
        throw new IllegalArgumentException();
        
    if(n1 < 10 || n2 < 10)
        return n1 % 10 == n2 % 10 ? 1 : 0;
        
    if(n1 % 10 == n2 % 10)
        return 1 + digitMatch(n1/10, n2/10);
        
    return digitMatch(n1/10, n2/10);
}

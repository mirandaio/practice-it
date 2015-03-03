public boolean monthApart(int m1, int d1, int m2, int d2) {
    if(m1 == m2)
        return false;
    
    if(Math.abs(m1 - m2) > 1)
        return true;
    
    if(m1 > m2)
        return d1 - d2 >= 0;
    
    return d2 - d1 >= 0;
}

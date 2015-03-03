public boolean dominant(int a, int b, int c) {
    if(a > b + c || b > a + c || c > a + b)
        return true;
    
    return false;
}

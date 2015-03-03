public int firstDigit(int n) {
    n = Math.abs(n);
    
    while(n > 9) {
        n /= 10;
    }
    
    return n;
}

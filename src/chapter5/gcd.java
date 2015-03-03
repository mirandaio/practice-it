public int gcd(int a, int b) {
    while(b != 0) {
        int temp = a;
        a = b;
        b = temp % b;
    }
    
    return Math.abs(a);
}

public int swapDigitPairs(int n) {
    int result = 0;
    int m = 1;
    
    while(n > 0) {
        int d1 = n % 10;
        n /= 10;
        
        if(n == 0) {
            result += m * d1;
            break;
        }
        
        int d2 = n % 10;
        result = result + m * 10 * d1 + m * d2;
        n /= 10;
        m *= 100;
    }
    
    return result;
}

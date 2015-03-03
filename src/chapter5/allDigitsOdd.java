public boolean allDigitsOdd(int num) {
    num = Math.abs(num);
    
    do {
        if(num % 2 == 0)
            return false;
        
        num /= 10;
    } while(num > 0);
    
    return true;
}

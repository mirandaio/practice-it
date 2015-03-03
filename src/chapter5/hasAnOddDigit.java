public boolean hasAnOddDigit(int num) {
    num = Math.abs(num);
    
    while(num > 0) {
        if(num % 2 == 1)
            return true;
        num /= 10;
    }
    
    return false;
}

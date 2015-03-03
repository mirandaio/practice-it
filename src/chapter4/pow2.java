public double pow2(double base, int exp) {
    double result = 1;
    
    for(int i = 0; i < Math.abs(exp); i++)
        result *= base;
        
    if(exp < 0)
        return 1 / result;
        
    return result;
}

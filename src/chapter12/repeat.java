public String repeat(String str, int n) {
    if(n < 0)
        throw new IllegalArgumentException();
        
    if(n == 0)
        return "";
        
    String half = repeat(str, n / 2);
    
    if(n % 2 == 0)
        return half + half;
        
    return str + half + half;
}

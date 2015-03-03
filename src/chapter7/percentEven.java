public double percentEven(int[] a) {
    if(a.length == 0)
        return 0.0;
        
    int count = 0;
    
    for(int i = 0; i < a.length; i++) {
        if(a[i] % 2 == 0)
            count++;
    }
    
    return count * 100.0 / a.length;
}

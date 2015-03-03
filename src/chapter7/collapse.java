public int[] collapse(int[] a) {
    int[] r = new int[(a.length + 1) / 2];
    int i = 0;
    
    for(int j = 0; j <= a.length - 2; j += 2) {
        r[i] = a[j] + a[j+1];
        i++;
    }
    
    if(i != r.length)
        r[i] = a[a.length - 1];
        
    return r;
}

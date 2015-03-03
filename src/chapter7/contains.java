public boolean contains(int[] a1, int[] a2) {
    for(int i = 0; i <= a1.length - a2.length; i++) {
        boolean c = true;
        
        for(int j = 0; j < a2.length; j++) {
            if(a1[i + j] != a2[j]) {
                c = false;
                break;
            }
        }
        
        if(c)
            return true;
    }
    
    return false;
}

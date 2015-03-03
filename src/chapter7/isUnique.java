public boolean isUnique(int[] a) {
    HashSet<Integer> set = new HashSet<Integer>();
    
    for(int i = 0; i < a.length; i++) {
        if(set.contains(a[i]))
            return false;
            
        set.add(a[i]);
    }
    
    return true;
}

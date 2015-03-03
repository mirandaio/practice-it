public int mode(int[] n) {
    int[] counts = new int[101];
    int maxCount = 0;
    int maxKey = -1;
    
    for(int i = 0; i < n.length; i++) {
        counts[n[i]]++;
        if(counts[n[i]] > maxCount) {
            maxCount = counts[n[i]];
            maxKey = n[i];
        }
    }
    
    return maxKey;
}

public int[] vowelCount(String str) {
    int[] counts = new int[5];
    
    for(int i = 0; i < str.length(); i++) {
        switch(str.charAt(i)) {
            case 'a':
            counts[0]++;
            break;
            
            case 'e':
            counts[1]++;
            break;
            
            case 'i':
            counts[2]++;
            break;
            
            case 'o':
            counts[3]++;
            break;
            
            case 'u':
            counts[4]++;
            break;
        }
    }
    
    return counts;
}

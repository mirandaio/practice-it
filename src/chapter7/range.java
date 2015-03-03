public int range(int[] arr) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
        
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    
    return max - min + 1;
}

public int countInRange(int[] arr, int min, int max) {
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
        if(min <= arr[i] && arr[i] <= max)
            count++;
    }
    
    return count;
}

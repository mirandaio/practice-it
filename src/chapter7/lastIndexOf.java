public int lastIndexOf(int[] arr, int val) {
    for(int i = arr.length - 1; i >= 0; i--) {
        if(arr[i] == val)
            return i;
    }
    return -1;
}

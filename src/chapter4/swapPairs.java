public String swapPairs(String str) {
    char[] arr = str.toCharArray();
    
    for(int i = 0; i <= arr.length - 2; i += 2) {
        char temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    
    return new String(arr);
}

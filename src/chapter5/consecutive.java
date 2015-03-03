public boolean consecutive(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    int mid = a + b + c - max - min;
    
    return max == mid + 1 && mid == min + 1;
}

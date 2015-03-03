public int maxSum(List<Integer> list, int n) {
    return maxSum(list, 0, n, list.size());
}

public int maxSum(List<Integer> list, int i, int n, int rem) {
    if(n <= 0 || rem == 0)
        return 0;
        
    int with = list.get(i) + maxSum(list, i + 1, n - list.get(i), rem - 1);
    int withOut = maxSum(list, i + 1, n, rem - 1);
    
    if(with <= n && n - with < n - withOut)
        return with;
        
    return withOut;
}

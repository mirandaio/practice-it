public void writeNums(int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    if(n == 1) {
        System.out.print(1);
        return;
    }
    
    writeNums(n - 1);
    System.out.print(", " + n);
}

public void writeSquares(int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    if(n == 1) {
        System.out.print(1);
        return;
    }
    
    if(n % 2 == 0) {
        writeSquares(n-1);
        System.out.print(", " + n * n);
    } else {
        System.out.print(n * n + ", ");
        writeSquares(n-1);
    }
}

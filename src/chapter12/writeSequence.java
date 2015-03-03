public void writeSequence(int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    if(n == 1) {
        System.out.print(1);
        return;
    }
    
    if(n == 2) {
        System.out.print("1 1");
        return;
    }
    
    int edge = (int) Math.ceil(n/2.0);
    
    System.out.print(edge + " ");
    writeSequence(n-2);
    System.out.print(" " + edge);
}

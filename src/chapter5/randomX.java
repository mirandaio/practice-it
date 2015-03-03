public void randomX() {
    Random r = new Random();
    int n;
    
    do {
        n = 5 + r.nextInt(15);
        for(int i = 0; i < n; i++)
            System.out.print("x");
        
        System.out.println();
    } while(n < 16);
}

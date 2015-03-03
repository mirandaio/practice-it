public void hopscotch(int n) {
    int current = 1;
    int total = 3 * n + 1;
    
    while(current < total) {
        if((current - 1) % 3 == 0) {
            System.out.println("   " + current);
            current++;
        } else {
            System.out.println(current + "     " + (current + 1));
            current += 2;
        }
    }
    
    System.out.println("   " + current);
}

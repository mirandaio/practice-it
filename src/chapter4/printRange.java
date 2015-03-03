public void printRange(int a, int b) {
    while(a != b) {
        System.out.print(a + " ");
        if(a < b)
            a++;
        else
            a--;
    }
    System.out.print(a);
}

public void printFactors(int n) {
    System.out.print(1);
    for(int i = 2; i <= n; i++) {
        if(n % i == 0)
            System.out.print(" and " + i);
    }
}

public void printPowersOfN(int base, int exp) {
    for(int i = 0; i <= exp; i++)
        System.out.print(((int) Math.pow(base, i)) + " ");
}

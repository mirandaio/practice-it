public void evenSum() {
    Scanner console = new Scanner(System.in);
    System.out.print("how many integers? ");
    int num = console.nextInt();
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < num; i++) {
        System.out.print("next integer? ");
        int temp = console.nextInt();
        if(temp % 2 == 0) {
            sum += temp;
            if(temp > max)
                max = temp;
        }
    }
    System.out.println("even sum = " + sum);
    System.out.println("even max = " + max);
}

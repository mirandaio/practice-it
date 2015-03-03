public void threeHeads() {
    Random r = new Random();
    int count = 0;
    while(count < 3) {
        boolean head = r.nextBoolean();
        if(head) {
            System.out.print("H ");
            count++;
        } else {
            System.out.print("T ");
            count = 0;
        }
    }
    System.out.println("\nThree heads in a row!");
}

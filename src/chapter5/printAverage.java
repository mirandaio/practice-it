public void printAverage(Scanner console) {
    System.out.print("Type a number: ");
    int num = console.nextInt();
    
    if(num < 0)
        return;
    
    int sum = 0;
    int count = 0;
    
    while(num >= 0) {
        sum += num;
        count++;
        System.out.print("Type a number: ");
        num = console.nextInt();
    }
    
    System.out.println("Average was " + ((double) sum / count));
}

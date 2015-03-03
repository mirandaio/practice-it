public boolean negativeSum(Scanner sc) {
    int sum = 0;
    int steps = 0;
    
    while(sc.hasNext()) {
        sum += sc.nextInt();
        steps++;
        
        if(sum < 0) {
            System.out.println(sum + " after " + steps + " steps");
            return true;
        }
    }
    
    System.out.println("no negative sum");
    return false;
}

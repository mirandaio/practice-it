public void countCoins(Scanner sc) {
    double totalCents = 0;
    
    while(sc.hasNext()) {
        int amount = sc.nextInt();
        String type = sc.next().toLowerCase();
        
        if(type.equals("pennies")) {
            totalCents += amount;
        } else if(type.equals("nickels")) {
            totalCents += 5 * amount;
        } else if(type.equals("dimes")) {
            totalCents += 10 * amount;
        } else if(type.equals("quarters")) {
            totalCents += 25 * amount;
        }
    }
    
    System.out.println("Total money: $" + 
        String.format("%.2f", totalCents / 100));
}

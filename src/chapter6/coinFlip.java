public void coinFlip(Scanner sc) {
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        int h = 0;
        int t = 0;
        
        while(line.hasNext()) {
            String c = line.next().toLowerCase();
            if(c.equals("h")) {
                h++;
            } else {
                t++;
            }
        }
        
        double percent = (double) (h * 100) / (h + t);
        
        System.out.println(h + " heads (" + String.format("%.1f", percent) + 
            "%)");
        
        if(h > t)
            System.out.println("You win!");
        
        System.out.println();
    }
}

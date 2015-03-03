public void plusScores(Scanner sc) {
    while(sc.hasNextLine()) {
        String name = sc.nextLine();
        String scores = sc.nextLine();
        int plus = 0;
        int minus = 0;
        
        for(int i = 0; i < scores.length(); i++) {
            if(scores.charAt(i) == '+') {
                plus++;
            } else {
                minus++;
            }
        }
        
        double percent = (double) (plus * 100) / (plus + minus);
        System.out.println(name + ": " + String.format("%.1f", percent) + 
            "% plus");
    }
}

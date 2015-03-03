public void inputStats(Scanner sc) {
    String longestLine = "";
    int lineNum = 0;
    
    while(sc.hasNextLine()) {
        lineNum++;
        String line = sc.nextLine();
        Scanner lineSc = new Scanner(line);
        int count = 0;
        int longestToken = 0;
        
        while(lineSc.hasNext()) {
            String token = lineSc.next();
            count++;
            
            if(token.length() > longestToken)
                longestToken = token.length();
        }
        
        System.out.println("Line " + lineNum + " has " + count + 
            " tokens (longest = " + longestToken + ")");
        
        if(line.length() > longestLine.length())
            longestLine = line;
    }
    
    System.out.println("Longest line: " + longestLine);
}

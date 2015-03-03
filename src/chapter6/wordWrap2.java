public void wordWrap2(Scanner sc, PrintStream ps) {
    int maxLineLength = 60;
    
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        
        while(line.length() > maxLineLength) {
            ps.println(line.substring(0, 60));
            line = line.substring(60);
        }
        
        ps.println(line);
    }
}

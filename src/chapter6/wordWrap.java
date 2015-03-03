public void wordWrap(Scanner sc) {
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        
        while(line.length() > 60) {
            System.out.println(line.substring(0, 60));
            line = line.substring(60);
        }
        
        System.out.println(line);
    }
}

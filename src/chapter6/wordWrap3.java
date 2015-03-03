public void wordWrap3(Scanner sc) {
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        
        while(line.length() > 60) {
            int i = 60;
            
            while(!Character.isWhitespace(line.charAt(i)))
                i--;
            
            System.out.println(line.substring(0, i));
            
            while(i < line.length() && Character.isWhitespace(line.charAt(i)))
                i++;
            
            line = line.substring(i);
        }
        
        System.out.println(line);
    }
}

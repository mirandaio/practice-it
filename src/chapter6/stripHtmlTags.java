public void stripHtmlTags(Scanner sc) {
    while(sc.hasNextLine()) {
        String htmlLine = sc.nextLine();
        
        boolean print = true;
        
        for(int i = 0; i < htmlLine.length(); i++) {
            if(htmlLine.charAt(i) == '<') {
                print = false;
            } else if(htmlLine.charAt(i) == '>') {
                print = true;
            } else if(print) {
                System.out.print(htmlLine.charAt(i));
            }
        }
        
        System.out.println();
    }
}

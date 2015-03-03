public void stripComments(Scanner sc) {
    boolean multiLineComment = false;
    
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        
        boolean singleLineComment = false;

        int i = 0;
        
        while(i < line.length()) {
            if(multiLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '*' && line.charAt(i+1) == '/') {
                multiLineComment = false;
                i += 2;
            } else if(!singleLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '/' && line.charAt(i+1) == '*') {
                multiLineComment = true;
                i += 2;
            } else if(!multiLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '/' && line.charAt(i+1) == '/') {
                singleLineComment = true;
                i += 2;
            } else if(singleLineComment || multiLineComment) {
                i++;
            } else {
                System.out.print(line.charAt(i));
                i++;
            }
        }
        
        if(!multiLineComment)
            System.out.println();
    }
}

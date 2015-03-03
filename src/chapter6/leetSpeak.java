public void leetSpeak(Scanner input, PrintStream output) {
    while(input.hasNextLine()) {
        String line = input.nextLine();
        StringBuilder leetLine = new StringBuilder();
        
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            
            if(Character.isWhitespace(c)) {
                leetLine.append(c);
            } else {
                if(i == 0 || 
                    (i > 0 && Character.isWhitespace(line.charAt(i - 1))) )
                    leetLine.append('(');
                
                if(c == 'o') {
                    leetLine.append('0');
                } else if(c == 'l') {
                    leetLine.append('1');
                } else if(c == 'e') {
                    leetLine.append('3');
                } else if(c == 'a') {
                    leetLine.append('4');
                } else if(c == 't') {
                    leetLine.append('7');
                } else if(c == 's' && (i == line.length() - 1 || 
                    Character.isWhitespace(line.charAt(i + 1)))) {
                    leetLine.append('Z');
                } else {
                    leetLine.append(c);
                }
                
                if(i == line.length() - 1 || 
                    Character.isWhitespace(line.charAt(i + 1)))
                    leetLine.append(')');
            }
        }
        
        output.println(leetLine);
    }
}

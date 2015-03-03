public String readEntireFile(Scanner sc) {
    StringBuilder text = new StringBuilder();
    
    while(sc.hasNextLine()) {
        text.append(sc.nextLine() + "\n");
    }
    
    return text.toString();
}

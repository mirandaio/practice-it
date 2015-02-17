public String padString(String str, int len) {
    StringBuilder padding = new StringBuilder();
    
    for(int i = 0; i < len - str.length(); i++)
        padding.append(" ");
    
    return padding.toString() + str;
}

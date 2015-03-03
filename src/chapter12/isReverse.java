public boolean isReverse(String str1, String str2) {
    if(str1.length() != str2.length())
        return false;
        
    if(str1.length() == 0)
        return true;
        
    char c1 = Character.toLowerCase(str1.charAt(0));
    char c2 = Character.toLowerCase(str2.charAt(str2.length()-1));
    return c1 == c2 && 
        isReverse(str1.substring(1), str2.substring(0, str2.length()-1));
}

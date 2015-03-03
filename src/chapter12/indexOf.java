public int indexOf(String str1, String str2) {
    if(str1.length() < str2.length())
        return -1;
                
    if(str1.substring(0, str2.length()).equals(str2))
        return 0;
        
    int index = indexOf(str1.substring(1), str2);
    
    if(index == -1)
        return -1;
        
    return 1 + index;
}

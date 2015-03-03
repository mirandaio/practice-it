public boolean isAllVowels(String str) {
    String vowels = "aeiouAEIOU";
    
    for(int i = 0; i < str.length(); i++) {
        if(vowels.indexOf(str.charAt(i)) == -1)
            return false;
    }
    
    return true;
}

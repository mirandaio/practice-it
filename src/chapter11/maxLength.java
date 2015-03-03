public int maxLength(Set<String> set) {
    int maxLength = 0;

    for(String str : set) {
        if(maxLength < str.length()) {
            maxLength = str.length();
        }
    }

    return maxLength;
}

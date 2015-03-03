public String repl(String str, int rep) {
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < rep; i++)
        result.append(str);
    return result.toString();
}

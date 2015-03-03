public String toString() {
    String sign = "";
    String pad = "";
    
    if(balance < 0) {
        balance = -balance;
        sign = "-";
    }
    
    int temp = (int) (balance * 100);
    int intPart = temp / 100;
    int decPart = temp % 100;
    
    if(decPart < 10)
        pad = "0";
    
    return name + ", " + sign + "$" + intPart + "." + pad + decPart;
}

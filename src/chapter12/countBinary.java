public void countBinary(int n) {
    String num = "";
    countBinary(n, num);
}

public void countBinary(int n, String num) {
    if(n == 0) {
        System.out.println(num);
        return;
    }
    
    countBinary(n - 1, num + "0");
    countBinary(n - 1, num + "1");
}

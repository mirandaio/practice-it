public boolean transactionFee(double fee) {
    double amount = (fee * transactions * (transactions + 1)) / 2;
    
    if(balance > amount) {
        balance -= amount;
        return true;
    }
    
    balance = 0;
    return false;
}

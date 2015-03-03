public void transfer(BankAccount ba, double money) {
    if(balance < 5 || money <= 0)
        return;
    
    if(balance < 5 + money) {
        ba.deposit(balance - 5);
        this.withdraw(balance);
    } else {
        ba.deposit(money);
        this.withdraw(5 + money);
    }
}

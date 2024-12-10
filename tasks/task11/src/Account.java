public abstract class Account {

    protected static int accountNumber = 0;
    protected double balance;    

    public Account(){
        accountNumber++;
        balance = 0;
    }
    public Account(double balance){
        accountNumber++;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void getBalance();
}

public class SavingsAccount extends Account{

    public SavingsAccount(){}
    
    public SavingsAccount(double balance){
        super(balance);
    }

    public void deposit(double amount){
        super.balance += amount;
    }    
    public void withdraw(double amount){
        if (super.balance >= 50000)
            super.balance -= amount;
        else
            System.out.println("Достигните 50000 сбережений на счете, чтобы снимать средства.");
    }    
    public void getBalance(){
        System.out.println("На вашем счету " + super.balance + " средств.");
    }

}

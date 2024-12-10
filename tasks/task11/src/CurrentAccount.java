public class CurrentAccount extends Account{


    public void deposit(double amount){
        super.balance += amount;
    }    
    public void withdraw(double amount){
        if (super.balance - amount >= -5000)
            super.balance -= amount;
        else 
            System.out.println("На вашем счете недостаточно средств!");
    }    
    public void getBalance(){
        System.out.println("На вашем счету " + super.balance + " средств.");
    }

}

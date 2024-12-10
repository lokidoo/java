public class App {
    public static void main(String[] args) throws Exception {

        CurrentAccount p1 = new CurrentAccount();
        p1.deposit(25000);
        p1.getBalance();
        p1.withdraw(60000);

        SavingsAccount p2 = new SavingsAccount(17000);
        p2.getBalance();
        p2.withdraw(15000);
        
    }
}

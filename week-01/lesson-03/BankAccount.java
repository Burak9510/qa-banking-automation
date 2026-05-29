public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double openingBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = openingBalance;

    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Error: deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ".New balance: " + balance);

    }

    public void withdraw(double amount){
        if(amount <= 0 ){
            System.out.println("Error: withdraw amount must be positive.");
            return;
        }
        if(amount > balance ){
            System.out.println("Error: insufficient funds");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". New balance: " + balance);
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}
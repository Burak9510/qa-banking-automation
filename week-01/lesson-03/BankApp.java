public class BankApp {
    public static void main(String[] args) {
        BankAccount alice = new BankAccount("Alice Smith", "ACC-001", 1000.0);

        alice.deposit(500);
        alice.withdraw(200);
        alice.deposit(-50);

        alice.withdraw(99999);


        System.out.println("Final balance for " + alice.getAccountHolder() + ": " + alice.getBalance());
    }}
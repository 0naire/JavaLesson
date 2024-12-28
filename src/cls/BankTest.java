package cls;

public class BankTest  {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345");
        BankAccount acc2 = new BankAccount("67890");

        acc1.deposit(100);
        acc1.print();

        acc2.withdraw(50);
        acc2.print();
    }
}

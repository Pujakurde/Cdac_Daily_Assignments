package bankacc;

public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Default Constructor
    public BankAccount() {
        super();
    }

    // Parameterized Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException();
            } else {
                balance += amount;
                System.out.println("Deposited: " + amount);
                System.out.println("Current Balance: " + balance);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException();
            }

            if (amount > balance) {
                throw new ArithmeticException();
            }

            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal amount");
        } catch (ArithmeticException e) {
            System.out.println("Insufficient balance");
        }
    }

    // Display Account Details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Main Method
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(101, "John", 5000);

        acc.displayAccount();

        acc.deposit(1000);
        acc.withdraw(2000);
        acc.withdraw(10000); // Insufficient balance
        acc.deposit(-50);    // Invalid deposit
    }
}
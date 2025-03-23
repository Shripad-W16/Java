import java.util.Scanner;

// Abstract class defining bank operations
abstract class AdvancedBankingSystem {
    private double balance; // Encapsulated balance

    // Constructor
    public AdvancedBankingSystem(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("❌ Initial balance cannot be negative. Setting balance to $0.");
            this.balance = 0;
        }
    }

    // Abstract methods (to be implemented in child class)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Method to check balance
    public void checkBalance() {
        System.out.println("💰 Current Balance: $" + balance);
    }

    // Getter for balance (Encapsulation)
    protected double getBalance() {
        return balance;
    }

    // Setter for balance (Encapsulation)
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Concrete class implementing abstract methods
class SavingsAccount extends AdvancedBankingSystem {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("✅ Deposited: $" + amount);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    // Implement withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("✅ Withdrawn: $" + amount);
        } else if (amount > getBalance()) {
            System.out.println("❌ Insufficient funds. Available balance: $" + getBalance());
        } else {
            System.out.println("❌ Invalid amount. Enter a positive number.");
        }
    }
}

// Main class for user interaction
public class BankingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User provides initial balance
        System.out.print("Enter initial balance: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("❌ Invalid input. Please enter a valid amount.");
            scanner.next();
        }
        double initialBalance = scanner.nextDouble();

        // Create SavingsAccount object
        SavingsAccount account = new SavingsAccount(initialBalance);

        while (true) {
            // Banking menu
            System.out.println("\n📌 Banking Menu");
            System.out.println("1️⃣ Deposit");
            System.out.println("2️⃣ Withdraw");
            System.out.println("3️⃣ Check Balance");
            System.out.println("4️⃣ Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input. Please enter a number (1-4).");
                scanner.next();
            }
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("❌ Invalid input. Enter a valid amount.");
                        scanner.next();
                    }
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("❌ Invalid input. Enter a valid amount.");
                        scanner.next();
                    }
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("🚀 Exiting... Thank you for banking with us!");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice. Please select a valid option.");
            }
        }
    }
}
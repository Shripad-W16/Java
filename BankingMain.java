import java.util.Scanner;


abstract class AdvancedBankingSystem {
    private double balance; 

    
    public AdvancedBankingSystem(double initialBalance) {
        if (initialBalance >= 0)
        {
            this.balance = initialBalance;
        } else 
        
        {
            System.out.println("Initial balance cannot be negative. Setting balance to $0.");
            this.balance = 0;
        }
    }

    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    
    public void checkBalance() {
        System.out.println( Current Balance: $" + balance);
    }

    
    protected double getBalance() {
        return balance;
    }

    
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}


class SavingsAccount extends AdvancedBankingSystem {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

   
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: Rs. + amount);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }

    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println(" Withdrawn: $" + amount);
        } else if (amount > getBalance()) {
            System.out.println(" Insufficient funds. Available balance: $" + getBalance());
        } else {
            System.out.println(" Invalid amount. Enter a positive number.");
        }
    }
}


public class BankingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter initial balance: ");
        while (!scanner.hasNextDouble()) {
            System.out.println(" Invalid input. Please enter a valid amount.");
            scanner.next();
        }
        double initialBalance = scanner.nextDouble();

        
        SavingsAccount account = new SavingsAccount(initialBalance);

        while (true) {
            
            System.out.println("\n Banking Menu");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3️ Check Balance");
            System.out.println("4️ Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println(" Invalid input. Please enter a number (1-4).");
                scanner.next(); }
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println(" Invalid input. Enter a valid amount.");
                        scanner.next();
                    }
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println(" Invalid input. Enter a valid amount.");
                        scanner.next();
                    }
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println(" Exiting... Thank you for using Shripad's banking Software!");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid choice. Please select a valid option.");
            }
        }
    } 
}

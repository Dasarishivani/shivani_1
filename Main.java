import java.util.Scanner;

class ATM {
    double balance = 6000;

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new Exception("Invalid deposit amount");
            }
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
            System.out.println("Updated Balance: " + balance);
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be greater than zero");
            }
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            }
            balance -= amount;
            System.out.println("Please collect your cash: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("\nATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    atm.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    atm.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
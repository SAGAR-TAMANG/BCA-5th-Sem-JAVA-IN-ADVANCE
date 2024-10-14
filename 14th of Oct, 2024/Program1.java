// Write a java program to implement the banking working mechanism by including the following details: 

// - use of constructors to take the details of name of the person, account number, and account balance.
// - create function for withdraw and display balance.
// - use switch case to implement the above function.

import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double accountBalance;

    // Constructor to initialize account details
    public BankAccount(String name, String accountNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accountNumber;
        this.accountBalance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient balance!");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. You withdrew: " + amount);
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + accountBalance);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for account creation
        System.out.print("Enter Account Holder's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a bank account object
        BankAccount account = new BankAccount(name, accNumber, initialBalance);

        int choice;

        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Display Balance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;

                case 2:
                    account.displayBalance();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

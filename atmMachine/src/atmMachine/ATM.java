package atmMachine;

import java.util.Scanner;

public class ATM {
    float balance = 10000.0f;
    int pin = 1234;
    int amount;

     private Scanner scanner;

    public ATM(Scanner scanner) {
        this.scanner = scanner;
    }

    public void card() {
        System.out.println("please insert your card..");

        int userInput;

        while (true) {
            System.out.print("Please enter a two-digit number (10 to 99): ");
            userInput = scanner.nextInt();

            if (userInput >= 10 && userInput <= 99) {
                System.out.println("You entered: " + userInput);
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void checkPin() {
        boolean isCorrect = false;
        int maxAttempts = 5;
        int attempts = 0;

        while (attempts < maxAttempts && !isCorrect) {
            System.out.println("Enter your pin:");
            int enterPin = scanner.nextInt();
            attempts++;

            if (enterPin == pin) {
                System.out.println("Verifying your pin...\nYou are successfully logged in.");
                isCorrect = true;
            } else {
                System.out.println("Invalid pin. Please try again.");
            }
        }

        if (!isCorrect) {
            System.out.println("Max attempts reached. Card locked.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void withDraw() {
        System.out.println("Enter amount to be withdrawn:");
        this.amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount % 100 != 0) {
            System.out.println("Please enter an amount in multiples of 100.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            System.out.println("Remaining balance: " + balance);
        }
    }

    public void deposit() {
        System.out.println("Enter amount to be deposited:");
        this.amount = scanner.nextInt();

        System.out.println("Machine only accepts 100/500/2000 notes. Please ensure your deposit matches this.");

        if (amount % 100 == 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("Updated balance: " + balance);
        } else {
            System.out.println("Only  100/200 notes are accepted.");
        }
    }
}



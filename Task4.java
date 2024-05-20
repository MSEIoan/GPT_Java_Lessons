
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Welcome to the Mini Banking System!");
        Bank start = new Bank();
        start.display();
    }
}

class Bank {

    Scanner key = new Scanner(System.in);
    String pad;
    Integer amount;
    Integer balance = 0;

    public void display() {
        System.out.println("Please choose an option: ");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.printf("4. Exit %n");
        System.out.print("Enter your choice: ");
        button();
        System.out.println("");
    }

    public void button() {
        key = new Scanner(System.in);
        pad = key.nextLine();
        if (pad.equalsIgnoreCase("1")) {
            showBalance();
        }
        if (pad.equalsIgnoreCase("2")) {
            deposit();
        }
        if (pad.equalsIgnoreCase("3")) {
            withdraw();
        }
        if (pad.equalsIgnoreCase("4")) {
            exit();
        }
    }

    public void showBalance() {
        System.out.println("Your balance is: " + balance);
        display();
    }

    public void deposit() {
        System.out.println("Enter the amount you want to deposit: ");
        amount = key.nextInt();
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful! Your new balance is $" + balance);
            display();
        } else {
            System.out.println("A deposit can not be negative !");
            display();
        }
    }

    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw: ");
        amount = key.nextInt();
        if (amount < balance) {
            balance -= amount;
            System.out.println("Withdraw successful! Your new balance is $" + balance);
            display();
        } else {
            System.out.println("You can't withdraw more money than you have.");
            display();
        }
    }

    public void exit() {
        System.out.println("Thank you for using the Mini Banking System! Goodbye!");
        key.nextLine();
        key.close();
        System.exit(0);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating Account Instances
        SavingAccount saving = new SavingAccount("123456", "Mansoor", 5000, 5);
        CurrentAccount current = new CurrentAccount("987654", "Haider", 10000, 2000);

        System.out.println("Choose account type: \n1. Savings \n2. Current");
        int choice = scanner.nextInt();

        if (choice == 1) {
            saving.deposit(200000);
            saving.withdraw(1000000);
            saving.applyInterest();
            saving.checkBalance();
        } else if (choice == 2) {
            current.deposit(5000000);
            current.withdraw(12000333); // Overdraft Example
            current.checkBalance();
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

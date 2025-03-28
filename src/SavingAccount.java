public class SavingAccount extends BankAccount {
    private double interestRate;

    // Constructor (Super Call Fix)
    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Apply Interest
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: " + interest + ". New balance: " + balance);
    }
}

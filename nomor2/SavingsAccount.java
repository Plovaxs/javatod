package nomor2;

public class SavingsAccount extends BankAccount {

  public SavingsAccount(double balance) {
    super(balance);
  }

  public void applyInterest() {
    double interest = getBalance() * 0.05;
    deposit(interest);
  }
}

package nomor1;

public class SavingsAccount extends BankAccount {

  private static final double MIN_BALANCE = 100;

  public SavingsAccount(double initialBalance) {
    super(initialBalance);
  }

  @Override
  protected boolean canWithdraw(double amount) {
    return getBalance() - amount >= MIN_BALANCE;
  }
}

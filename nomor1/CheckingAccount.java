package nomor1;

public class CheckingAccount extends BankAccount {

  private static final double OVERDRAFT_LIMIT = -500;

  public CheckingAccount(double initialBalance) {
    super(initialBalance);
  }

  @Override
  protected boolean canWithdraw(double amount) {
    return getBalance() - amount >= OVERDRAFT_LIMIT;
  }
}

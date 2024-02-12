package nomor2;

public class CheckingAccount extends BankAccount {

  public CheckingAccount(double balance) {
    super(balance);
  }

  public void applyOverdraftFee() {
    if (getBalance() < 0) {
      deposit(10); // apply a $10 overdraft fee
    }
  }
}

package nomor2;

public class Customer {

  public void performTransaction(BankAccount account, double amount) {
    // Perform a deposit if the amount is positive, otherwise perform a withdrawal
    if (amount > 0) {
      account.deposit(amount);
    } else {
      account.withdraw(-amount);
    }
  }
}

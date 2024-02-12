package nomor1;

public abstract class BankAccount {

  private double balance;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println(
        "Deposited: $" + amount + ". New balance: $" + balance
      );
    } else {
      System.out.println("Invalid deposit amount: $" + amount);
    }
  }

  public void withdraw(double amount) {
    if (amount > 0) {
      if (canWithdraw(amount)) {
        balance -= amount;
        System.out.println(
          "Withdrawn: $" + amount + ". New balance: $" + balance
        );
      } else {
        System.out.println("Insufficient funds for withdrawal: $" + amount);
      }
    } else {
      System.out.println("Invalid withdrawal amount: $" + amount);
    }
  }

  public double getBalance() {
    return balance;
  }

  protected abstract boolean canWithdraw(double amount);
}

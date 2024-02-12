package nomor1;

public class nomor1 {

  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SavingsAccount(500);
    CheckingAccount checkingAccount = new CheckingAccount(200);

    savingsAccount.deposit(100);
    savingsAccount.withdraw(50);

    checkingAccount.deposit(200);
    checkingAccount.withdraw(100);
    checkingAccount.withdraw(300);

    System.out.println(
      "Savings account balance: $" + savingsAccount.getBalance()
    );
    System.out.println(
      "Checking account balance: $" + checkingAccount.getBalance()
    );
  }
}

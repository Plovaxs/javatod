package nomor3;

import java.util.Arrays;

interface InterestBearing {
  double calculateInterest();
}

class BankAccount {

  double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }
}

class SavingsAccount extends BankAccount implements InterestBearing {

  private double interestRate;

  public SavingsAccount(double balance, double interestRate) {
    super(balance);
    this.interestRate = interestRate;
  }

  @Override
  public double calculateInterest() {
    return getBalance() * interestRate;
  }
}

class CheckingAccount extends BankAccount {

  public CheckingAccount(double balance) {
    super(balance);
  }
}

class Customer {

  public void performTransaction(BankAccount account, double amount) {
    if (
      account instanceof SavingsAccount || account instanceof CheckingAccount
    ) {
      if (amount > 0) {
        account.balance += amount;
      } else {
        if (Math.abs(amount) > account.balance) {
          System.out.println("Insufficient funds for withdrawal");
        } else {
          account.balance -= Math.abs(amount);
        }
      }
    } else {
      System.out.println("Unsupported account type");
    }
  }
}

public class Main {

  public static void main(String[] args) {
    SavingsAccount savingsAccount1 = new SavingsAccount(1000, 0.05);
    SavingsAccount savingsAccount2 = new SavingsAccount(2000, 0.03);
    CheckingAccount checkingAccount = new CheckingAccount(3000);

    Customer customer = new Customer();
    customer.performTransaction(savingsAccount1, 500);
    customer.performTransaction(checkingAccount, -200);

    InterestBearing[] interestBearingAccounts = {
      savingsAccount1,
      savingsAccount2,
    };

    for (InterestBearing account : interestBearingAccounts) {
      System.out.println(
        "Interest for " +
        account.getClass().getSimpleName() +
        ": " +
        account.calculateInterest()
      );
    }
  }
}

package nomor2;

public class Main {

  public static void main(String[] args) {
    SavingsAccount savings = new SavingsAccount(1000.0);
    CheckingAccount checking = new CheckingAccount(500.0);

    Customer customer = new Customer();

    customer.performTransaction(savings, 1000.0); // deposit 1000 into savings
    customer.performTransaction(checking, -500.0); // withdraw 500 from checking

    System.out.println("Savings balance: " + savings.getBalance());
    System.out.println("Checking balance: " + checking.getBalance());
  }
}

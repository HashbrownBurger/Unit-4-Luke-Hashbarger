public class Bank {
  private String password;
  private String username;
  private double balance;
  private double interest;
  private int accountNumber;

  public Bank(String bankUsername, String bankPassword, int bankAccountNumber, double bankBalance, double bankInterest) {
    password = bankPassword;
    username = bankUsername;
    accountNumber = bankAccountNumber;
    balance = bankBalance;
    interest = bankInterest;
  }

  public void addBalance(double addBalance) {
    this.balance += addBalance;
  }

    public void interest (double timePast){
      balance = (balance) * (interest) * (timePast);
    }

  public String getPassword() {
    return password;
  }

  public String getUsername() {
    return username;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }
  public double interest() {
    return interest;
  }
  public String toString() {
    String result = "";
    result += "\n Username: " + username + "\n";
    result += "Password: " + password + "\n";
    result += "Account number: " + accountNumber + "\n";
    result += "Balance: " + balance + "\n";
    return result;
  }
  }



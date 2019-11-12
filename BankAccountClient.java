public class BankAccountClient{
public static void main(String[] args){
  double addBalance = 0.0;
  double timePast = 365; //days
    Bank myBank = new Bank("Hashbrown", "Burger", 42069, 1, 0.012);
    System.out.println(myBank.toString());

    myBank.addBalance(addBalance);
    System.out.println("Bank after adding " + addBalance +"is " + myBank);

    myBank.interest(timePast);
  System.out.println("After Interest = " + myBank);

  }
}


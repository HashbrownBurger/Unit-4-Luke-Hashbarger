//creates instances of coin class and tests attributes and behaviors

public class CoinTester{
  public static void main(String[] args) {
    int timesHeads = 0;
    int timesTails = 0;
    int timesToFlip = 10000;

    for (int i = 1; i <= timesToFlip; i++){
    String head = "HEADS";
    String tail = "TAILS";
    Coin myCoin = new Coin();
    System.out.println("My coin = " + myCoin.toString());
    if(myCoin.isHeads()){
      timesHeads++;}
    else{
      timesTails++;
      }
}
  System.out.println("You had heads " + timesHeads + " times");
  System.out.println("You had tails " + timesTails + " times");

  }
}

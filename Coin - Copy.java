/*
This is Coin class
blueprint for coin object
*/

public class Coin{
  //These are the declarations for the attributes (instance variables) of a coin
  private int face;

  private final int HEADS = 0; //Constants defining heads and tails
  private final int TAILS = 1;

/*
The coin cunstructor that defines what happens when a coin object is made
when a new coin is made it gets flipped
*/
  public Coin(){
    flip();
  }

/*
this is the section of the class containing  the methods (behaviors) of a coin

flip method assigns randomly chosen value to the face of the coin
*/

/*
accessor method for face varriable (a getter)
*/
public int getFace(){
  return face;
}

/*
Set method
*/
public void getFace(int newFace){
  face = newFace;
}

  public void flip(){
    face = (int) (Math.random() * 2);
  }

  /*
the isHeads method tells us if the coins face is heads
  */
  public boolean isHeads(){
    return (face == HEADS );
  }
/*
prints out info on currect state of coins
*/
  public String toString(){
    String result = "";
    if (face == HEADS){
      result = "HEADS";
    }
    else{
      result = "TAILS";
    }
    return result;
  }
}

/*
implement a class called Car with the following properties and behaviors.

A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the methods from the Car class and print out relevant information to prove the proper functionality of your Car class.

Do not submit files for this assignment. The classes should be kept in your Unit 4 Project and turned in at the end of the Unit
*/

public class Car{
  private String make;
  private String model;
  private double MPG;        //miles per gallon
  private double tankSize;   //in gallons
  private double amountFuel; //in gallons


/*
Constructor for the car. intitializes instance varriables
*/
  public Car (String carMake, String carModel, double carMPG, double carTankSize){
    make = carMake;
    model = carModel;
    MPG = carMPG;
    tankSize = carTankSize;
    amountFuel = carTankSize;
    }
    public String getMake(){
      return make;
    }
    public String getModel(){
      return model;
    }
    public double getMPG(){
      return MPG;
    }
    public double getTankSize(){
      return tankSize;
    }
    public double getAmountFuel(){
      return amountFuel;
    }

    public String toString(){
      String result = "";
      result += "\n Make: " + make + "\n";
      result += "Model: " + model + "\n";
      result += "MPG: " + MPG + "\n";
      result += "Fuel: " + amountFuel + "\n";
      return result;
    }

    public double drive(double distanceDriven){
      amountFuel = (MPG * tankSize - distanceDriven)/MPG;
      return amountFuel;
    }

//make drive and add fuel methods
  public double addFuel(double fuel){
    amountFuel += fuel;
    return amountFuel;
  }
}

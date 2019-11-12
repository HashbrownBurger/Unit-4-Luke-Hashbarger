public class Racetrack{
  public static void main(String[] args) {
    double fuelAdded = 5.0;
    double distanceDriven = 100.3;
    Car myCar = new Car("Minch", "Levi", 37.9, 13.0);

    System.out.println(myCar);


    myCar.drive(distanceDriven);

    System.out.println("Drove " + distanceDriven + ":" + myCar);

    myCar.addFuel(fuelAdded); //adds 10.5 gallons to amountFuel

    System.out.println("Added " + fuelAdded + " gallons to my: " + myCar);

    Car godCar = new Car("Prius", "Highlander", 3, 89);

    System.out.println(godCar);


    godCar.drive(distanceDriven);

    System.out.println("Drove " + distanceDriven + ":" + godCar);

    godCar.addFuel(fuelAdded); //adds 5.0 gallons to amountFuel

    System.out.println("Added " + fuelAdded + " gallons to my: " + godCar);

    Car hisCar = new Car("BMW", "Ford", 420, 69);

    System.out.println(hisCar);

    hisCar.drive(distanceDriven);

    System.out.println("Drove " + distanceDriven + ":" + hisCar);

    godCar.addFuel(fuelAdded); //adds 5 gallons to amountFuel

    System.out.println("Added " + fuelAdded + " gallons to my: " + hisCar);
}
}

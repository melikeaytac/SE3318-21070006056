package org.example;

/**
 * The Main class runs the car rental system.
 */
public class Main {
  /**
   * Entry point of the application.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    VehicleAbstract car1 = new LuxuryCar("BMW", "7 Series", "34ABC123", true, true);
    VehicleAbstract car2 = new EconomyCar("Toyota", "Yaris", "35XYZ789", true);

    RentalRecord rental1 = new RentalRecord(car1, "John Doe", 3);
    RentalRecord rental2 = new RentalRecord(car2, "Jane Smith", 5);

    rental1.printRecord();
    rental2.printRecord();
  }
}

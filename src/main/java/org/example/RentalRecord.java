package org.example;

/**
 * Represents a rental record for a specific vehicle.
 * It includes information about the lessor and rental duration.
 */
public class RentalRecord {
  private VehicleAbstract vehicle;
  private String lessorName;
  private int rentalDays;
  private double totalPrice;

  /**
   * Constructor for RentalRecord.
   *
   * @param vehicle    the rented vehicle
   * @param lessorName name of the customer who rents
   * @param rentalDays number of rental days
   */
  public RentalRecord(VehicleAbstract vehicle, String lessorName, int rentalDays) {
    this.vehicle = vehicle;
    this.lessorName = lessorName;
    this.rentalDays = rentalDays;
    this.totalPrice = vehicle.calculateDailyPrice() * rentalDays;
  }

  /**
   * Prints the rental details to the console.
   */
  public void printRecord() {
    System.out.println("Vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
    System.out.println("License Plate: " + vehicle.getLicensePlate());
    System.out.println("Lessor: " + lessorName);
    System.out.println("Rental Days: " + rentalDays);
    System.out.println("Total Price: $" + totalPrice);
  }
}

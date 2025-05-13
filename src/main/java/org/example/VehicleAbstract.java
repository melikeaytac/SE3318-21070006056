package org.example;

/**
 * An abstract class representing a general vehicle.
 * It holds common properties for all vehicle types.
 */
public abstract class VehicleAbstract {
  protected String brand;
  protected String model;
  protected String licensePlate;

  /**
   * Constructor for VehicleAbstract.
   *
   * @param brand        the brand of the vehicle
   * @param model        the model of the vehicle
   * @param licensePlate the license plate of the vehicle
   */
  public VehicleAbstract(String brand, String model, String licensePlate) {
    this.brand = brand;
    this.model = model;
    this.licensePlate = licensePlate;
  }

  /**
   * Calculates the daily price of the vehicle.
   *
   * @return the total daily price
   */
  public abstract double calculateDailyPrice();

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getLicensePlate() {
    return licensePlate;
  }
}

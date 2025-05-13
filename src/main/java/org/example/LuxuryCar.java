package org.example;

/**
 * Represents a luxury car which may include GPS and leather seats.
 * Inherits from VehicleAbstract.
 */
public class LuxuryCar extends VehicleAbstract {
  private boolean hasGps;
  private boolean hasLeatherSeats;

  public static final double BASE_PRICE = 100;
  public static final double GPS_PRICE = 20;
  public static final double LEATHER_PRICE = 30;

  /**
   * Constructor for LuxuryCar.
   *
   * @param brand           the brand of the vehicle
   * @param model           the model of the vehicle
   * @param plate           the license plate
   * @param hasGps          whether the car has GPS
   * @param hasLeather      whether the car has leather seats
   */
  public LuxuryCar(String brand, String model, String plate, boolean hasGps, boolean hasLeather) {
    super(brand, model, plate);
    this.hasGps = hasGps;
    this.hasLeatherSeats = hasLeather;
  }

  /**
   * Calculates the daily price including GPS and leather seats if available.
   *
   * @return the daily rental price
   */
  @Override
  public double calculateDailyPrice() {
    double price = BASE_PRICE;
    if (hasGps) {
      price += GPS_PRICE;
    }
    if (hasLeatherSeats) {
      price += LEATHER_PRICE;
    }
    return price;
  }
}

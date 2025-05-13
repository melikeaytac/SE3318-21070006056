package org.example;

/**
 * Represents an economy car which may have hybrid feature.
 * Inherits from VehicleAbstract.
 */

public class EconomyCar extends VehicleAbstract {
  private boolean isHybrid;

  public static final double BASE_PRICE = 50;
  public static final double HYBRID_PRICE = 10;

  /**
   * Constructor for EconomyCar.
   *
   * @param brand        the brand of the car
   * @param model        the model of the car
   * @param licensePlate the license plate
   * @param isHybrid     whether the car is a hybrid
   */
  public EconomyCar(final String brand, final String model, final String licensePlate,
                    final boolean isHybrid) {
    super(brand, model, licensePlate);
    this.isHybrid = isHybrid;
  }

  /**
   * Calculates the daily price including hybrid surcharge if applicable.
   *
   * @return the daily rental price
   */
  @Override
  public double calculateDailyPrice() {
    return isHybrid ? BASE_PRICE + HYBRID_PRICE : BASE_PRICE;
  }
}

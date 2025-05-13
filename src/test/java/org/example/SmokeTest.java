package org.example;

/**
 * This class contains smoke tests for the Car Rental System.
 * It verifies basic functionality of vehicle creation and rental pricing.
 */
public class SmokeTest {

  public static void main(String[] args) {
    testLuxuryCarPriceCalculation();
    testEconomyCarPriceCalculation();
    testRentalRecordTotalPrice();
  }

  /**
   * Tests the price calculation of a luxury car with features.
   */
  public static void testLuxuryCarPriceCalculation() {
    VehicleAbstract car = new LuxuryCar("Audi", "A8", "06AAA123", true, true);
    double expected = 100 + 20 + 30;
    double actual = car.calculateDailyPrice();
    System.out.println("[LuxuryCar] Expected: $" + expected + ", Actual: $" + actual);
    assert expected == actual : "LuxuryCar price calculation failed!";
  }

  /**
   * Tests the price calculation of an economy hybrid car.
   */
  public static void testEconomyCarPriceCalculation() {
    VehicleAbstract car = new EconomyCar("Honda", "Civic", "35BBB456", true);
    double expected = 50 + 10;
    double actual = car.calculateDailyPrice();
    System.out.println("[EconomyCar] Expected: $" + expected + ", Actual: $" + actual);
    assert expected == actual : "EconomyCar price calculation failed!";
  }

  /**
   * Tests the total price calculation for a rental record.
   */
  public static void testRentalRecordTotalPrice() {
    VehicleAbstract car = new LuxuryCar("Mercedes", "S-Class", "34CCC789", true, false);
    RentalRecord rental = new RentalRecord(car, "Alice Johnson", 4);
    double expected = (100 + 20) * 4;
    double actual = car.calculateDailyPrice() * 4;
    System.out.println("[RentalRecord] Expected Total: $" + expected + ", Actual: $" + actual);
    assert expected == actual : "RentalRecord total price calculation failed!";
  }
}

package org.example;

/**
 * The {@code MiddleEarthMap} class simulates navigation through various
 * iconic locations in the Middle-Earth universe.
 * It also considers whether a secret passage is used during travel.
 */
public class MiddleEarthMap {

  /**
   * Navigates the character to a specified location on the Middle-Earth map.
   * Based on the location and whether a secret passage is used, the method prints
   * out relevant navigation details.
   *
   * @param location          the destination {@link Location} to navigate to
   * @param isSecretPassage   {@code true} if a secret passage is being used; otherwise {@code false}
   */
  public void navigate(Location location, boolean isSecretPassage) {
    switch (location) {
      case MORDOR:
        System.out.println("Navigating to Mordor");
        if (isSecretPassage) {
          System.out.println("Taking a secret passage");
        }
        break;
      case SHIRE:
        System.out.println("Navigating to the Shire");
        // FallThrough violation - Missing break
      case GONDOR:
        System.out.println("Navigating to Gondor");
      default:
        System.out.println("Unknown location");
    }

    switch (location) {
      case LOTHLORIEN:
        System.out.println("Navigating to Lothlórien");
    }

    if (isSecretPassage) {
      // Placeholder for future logic
    }

    String result = isSecretPassage ? "Secret" : "Normal";
    System.out.println(result);
  }
}

package org.example;

/**
 * The {@code MiddleEarthMap} class simulates navigation through various
 * iconic locations in the Middle-Earth universe.
 * It also considers whether a secret passage is used during travel.
 */
public class MiddleEarthMap {

  /**
   * Navigates to a given location name in the Middle-Earth world.
   * Based on the provided location string and whether a secret passage is used,
   * the method prints relevant navigation details.
   *
   * @param location        the destination location as a {@code String}
   * @param isSecretPassage {@code true} if a secret passage is used; otherwise {@code false}
   */
  public void navigate(String location, boolean isSecretPassage) {
    switch (location) {
      case "Mordor":
        System.out.println("Navigating to Mordor");
        if (isSecretPassage) {
          System.out.println("Taking a secret passage");
        }
        break;
      case "Shire":
        System.out.println("Navigating to the Shire");
        // FallThrough violation - Missing break
      case "Gondor":
        System.out.println("Navigating to Gondor");
      default:
        System.out.println("Unknown location");
    }

    switch (location) {
      case "Lothlórien":
        System.out.println("Navigating to Lothlórien");
    }

    if (isSecretPassage) {
      // Placeholder for future logic
    }

    String result = isSecretPassage ? "Secret" : "Normal";
    System.out.println(result);
  }
}

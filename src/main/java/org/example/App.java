package org.example;

/**
 * The {@code App} class serves as the entry point for the Middle-Earth simulation program.
 * It demonstrates how a character interacts with a quest using the system's defined classes.
 */
public class App {

  /**
   * The main method where the application starts execution.
   * It creates a sample character (Frodo) and a sample quest,
   * then shows the character accepting and completing the quest.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    // Create a new character
    Character frodo = new Character("Frodo", "Hobbit", 50, "Sting");

    // Create a new quest
    Quest destroyRing = new Quest();

    // Display character details
    frodo.printDetails();

    // Attempt to complete the quest
    frodo.completeQuest(destroyRing, 120, true);
  }
}

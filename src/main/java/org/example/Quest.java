package org.example;

/**
 * The {@code Quest} class represents a generic quest in the Middle-Earth universe.
 * Each quest can be attempted by a character with a given point score and status as the ring bearer.
 */
public class Quest {

  /**
   * Evaluates whether a character has completed the quest based on their score and role as the ring bearer.
   *
   * @param points         the score or achievement points of the character
   * @param isRingBearer   whether the character attempting the quest is the ring bearer
   * @return {@code false} by default; should be overridden by subclasses to implement specific logic
   */
  public boolean completeQuest(int points, boolean isRingBearer) {
    return false;
  }

  /**
   * Returns the title of the quest.
   *
   * @return a string representing the quest title (default is a blank space)
   */
  public String getTitle() {
    return " ";
  }
}

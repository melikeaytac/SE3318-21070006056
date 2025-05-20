package org.example;

/**
 * The {@code Character} class represents a being in the Middle-Earth universe
 * with specific attributes like name, race, age, and weapon.
 * Characters can participate in quests and display their personal details.
 */
public class Character {
  /** The name of the character */
  private String name;

  /** The race of the character (e.g., Hobbit, Elf, Human) */
  private String race;

  /** The age of the character */
  private int age;

  /** The weapon the character carries */
  private String weapon;

  /**
   * Constructs a new {@code Character} instance with the specified attributes.
   *
   * @param name    the name of the character
   * @param race    the race of the character
   * @param age     the age of the character
   * @param weapon  the weapon the character carries
   */
  public Character(String name, String race, int age, String weapon) {
    this.name = name;
    this.race = race;
    this.age = age;
    this.weapon = weapon;
  }

  /**
   * Prints the details of the character, including name, race, age, and weapon.
   */
  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Race: " + race);
    System.out.println("Age: " + age);
    System.out.println("Weapon: " + weapon);
  }

  /**
   * Displays that the character has accepted a specific quest.
   *
   * @param quest the quest that the character is accepting
   */
  public void acceptQuest(Quest quest) {
    System.out.println(name + " has accepted the quest: " + quest.getTitle());
  }

  /**
   * Attempts to complete the given quest using the character's score and role.
   * The result is printed to indicate success or failure.
   *
   * @param quest         the quest to be completed
   * @param points        the score the character has
   * @param isRingBearer  true if the character is the ring bearer
   */
  public void completeQuest(Quest quest, int points, boolean isRingBearer) {
    System.out.println(name + " is attempting to complete a quest...");
    boolean result = quest.completeQuest(points, isRingBearer);
    if (result) {
      System.out.println(name + " has successfully completed the quest!");
    } else {
      System.out.println(name + " failed the quest.");
    }
  }
}

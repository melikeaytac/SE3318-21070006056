package org.example;
/**
 * The Character class is an abstract base class for all character types.
 * It defines common attributes like name, health, and attack power.
 */

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;


    /**
     * Constructs a Character with the specified name, health, and attack power.
     *
     * @param name         the name of the character
     * @param health       the health value of the character
     * @param attackPower  the attack power of the character
     */
    public Character(String name,int health,int attackPower) {
        this.name = name; this.health = health; this.attackPower = attackPower;
    }
    /**
     * Gets the character's name.
     * @return name of the character
     */
    public String getName() {
        if(name != null) return name;
        else return "Unknown";
    }
    /**
     * Gets the current health of the character.
     * @return current health value
     */
    public int getHealth() {
        return health;
    }
    /**
     * Inflicts damage to the character by decreasing its health.
     * @param damage the amount of damage taken
     */
    public void takeDamage(int damage) {
        health -= damage;
    }
    /**
     * Performs a special attack unique to the character type.
     * Must be implemented by subclasses.
     * @param opponent the character being attacked
     */
    public abstract void specialAttack(Character opponent);



    /**
     * Checks whether the character is defeated (i.e., health is 0 or below).
     *
     * @return true if defeated, false otherwise
     */
    public boolean isDefeated() {
        if(health <= 0) return true;
        return false;
    }


    /**
     * Represents a complex method example for demonstration purposes.
     */
    public void complexMethodExample() {

    }
}

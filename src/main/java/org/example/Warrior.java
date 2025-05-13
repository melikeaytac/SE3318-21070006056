package org.example;
/**
 * The Warrior class represents a strong melee fighter.
 * It extends the Character class and defines a powerful physical attack.
 */

public class Warrior extends Character {

    /**
     * Constructs a Warrior with the specified name, health, and attack power.
     *
     * @param name         the name of the warrior
     * @param health       the health value of the warrior
     * @param attackPower  the attack power of the warrior
     */
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }


    /**
     * Performs a powerful melee special attack on the opponent.
     * Deals double the normal attack power as damage.
     *
     * @param opponent the character being attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }
}
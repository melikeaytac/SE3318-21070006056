package org.example;
/**
 * The Mage class represents a character who uses magical attacks.
 * It inherits from the Character class and implements a special attack method.
 */

public class Mage extends Character {

    /**
     * Constructs a Mage with the specified name, health, and attack power.
     *
     * @param name         the name of the mage
     * @param health       the health value of the mage
     * @param attackPower  the attack power of the mage
     */
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }


    /**
     * Performs a magical special attack on the opponent.
     * Deals high damage using magic power.
     *
     * @param opponent the character being attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 50);
    }
}

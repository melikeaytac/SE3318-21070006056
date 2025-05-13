package org.example;
/**
 * The Archer class represents a ranged fighter.
 * It extends the Character class and performs long-distance attacks.
 */

public class Archer extends Character {
    /**
     * Constructs an Archer with the specified name, health, and attack power.
     *
     * @param name         the name of the archer
     * @param health       the health value of the archer
     * @param attackPower  the attack power of the archer
     */

    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    /**
     * Performs a special ranged attack on the opponent.
     * Deals additional damage compared to a regular attack.
     *
     * @param opponent the character being attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }
}
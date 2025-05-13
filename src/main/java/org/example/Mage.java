package org.example;

public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 50);
    }
}

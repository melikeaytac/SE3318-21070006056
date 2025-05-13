package org.example;

public class Warrior extends Character {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }
}
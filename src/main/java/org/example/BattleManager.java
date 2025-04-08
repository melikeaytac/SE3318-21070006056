package org.example;
public class BattleManager {
    public void battle(Hero hero, Enemy enemy) {
        System.out.println("Battle starts between Hero " + hero.getName() + " and Enemy " + enemy.getName());

        if (hero.getLevel() >= enemy.getLevel()) {
            System.out.println("Hero " + hero.getName() + " wins!");
        } else {
            System.out.println("Enemy " + enemy.getName() + " wins!");
        }
    }
}

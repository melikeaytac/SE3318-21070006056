package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * SmokeTest class performs basic smoke testing
 * to ensure classes and methods function without crashing.
 */
public class SmokeTest {

    @Test
    public void testWarriorCreation() {
        Warrior warrior = new Warrior("Conan", 100, 20);
        assertEquals("Conan", warrior.getName());
        assertEquals(100, warrior.getHealth());
    }

    @Test
    public void testMageCreationAndAttack() {
        Mage mage = new Mage("Gandalf", 90, 25);
        Warrior target = new Warrior("Dummy", 100, 10);
        mage.specialAttack(target);
        assertTrue(target.getHealth() < 100);
    }

    @Test
    public void testArcherSpecialAttack() {
        Archer archer = new Archer("Robin", 95, 18);
        Mage target = new Mage("TargetMage", 100, 20);
        archer.specialAttack(target);
        assertTrue(target.getHealth() < 100);
    }

    @Test
    public void testCharacterDefeated() {
        Warrior w = new Warrior("Dying", 5, 10);
        w.takeDamage(10);
        assertTrue(w.isDefeated());
    }

    @Test
    public void testGameRun() {
        Game game = new Game();
        game.addCharacter(new Mage("M1", 50, 10));
        game.addCharacter(new Archer("A1", 50, 10));
        // just check if startGame() runs without exceptions
        game.startGame();
    }
}

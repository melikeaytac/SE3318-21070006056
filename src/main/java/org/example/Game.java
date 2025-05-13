package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * The Game class manages the character battle process.
 * It adds characters to the game and controls the battle flow.
 */

public class Game {
    private List<Character> characters = new ArrayList<>();

    /**
     * Adds a character to the list of participants in the game.
     *
     * @param character the character to be added
     */
    public void addCharacter(Character character){
        characters.add(character);
    }


    /**
     * Starts the character battle.
     * Characters take turns performing special attacks until one is defeated.
     */
    public void startGame() {
        int turn = 0; boolean gameOver = false; // Violates EmptyLineSeparator
        while (!gameOver) {
            Character attacker = characters.get(turn % characters.size());
            Character defender = characters.get((turn + 1) % characters.size());

            attacker.specialAttack(defender);
            System.out.println(attacker.getName() + " attacks " + defender.getName());

            if (defender.isDefeated()) {
                System.out.println(defender.getName() + " is defeated!");
                gameOver = true; // Use of local variable instead of a method to check game over state
            }

            turn++;
        }
    }


    /**
     * Checks whether the game is over by verifying if any character is defeated.
     *
     * @return true if at least one character is defeated, false otherwise
     */
    private boolean isGameOver() {
        for(Character character : characters) {
            if(character.isDefeated()) {
                return true; // Multiple return statements
            }
        }
        return false;
    }
}


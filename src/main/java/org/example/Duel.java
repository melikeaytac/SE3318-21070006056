package org.example;
import java.util.Random;

public class Duel {
    /**
     * Starts a duel between two students using a spell.
     * _requires_: s1 and s2 are not null, spell is not null
     * _effects_: Determines the winner based on spell knowledge and randomness
     * @param s1 First student
     * @param s2 Second student
     * @param spell The spell used in the duel
     */
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        System.out.println(s1.getName() + " vs " + s2.getName() + " using " + spell + "!");

        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("It's a draw! No one knows the spell.");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + " wins!");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + " wins!");
        } else {
            Random rand = new Random();
            if (rand.nextBoolean()) {
                System.out.println(s1.getName() + " wins the duel!");
            } else {
                System.out.println(s2.getName() + " wins the duel!");
            }
        }
    }
}

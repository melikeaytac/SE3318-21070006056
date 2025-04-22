package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DuelTest {
    private HogwartsStudent s1, s2;

    @BeforeEach
    void setUp() {
        s1 = new HogwartsStudent("Harry", "Gryffindor", 3);
        s2 = new HogwartsStudent("Draco", "Slytherin", 3);
    }

    @Test
    void testDuelBothKnowSpell() {
        s1.learnSpell("Expelliarmus");
        s2.learnSpell("Expelliarmus");
        Duel.start(s1, s2, "Expelliarmus");
    }

    @Test
    void testDuelOneKnowsSpell() {
        s1.learnSpell("Expelliarmus");
        Duel.start(s1, s2, "Expelliarmus");
    }

    @Test
    void testDuelNeitherKnowsSpell() {
        Duel.start(s1, s2, "Expelliarmus");
    }
}

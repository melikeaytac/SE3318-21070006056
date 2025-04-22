package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SpellbookTest {
    private Spellbook spellbook;

    @BeforeEach
    void setUp() {
        spellbook = new Spellbook();
        spellbook.addSpell("Alohomora");
        spellbook.addSpell("Accio");
        spellbook.addSpell("Expelliarmus");
    }

    @Test
    void testGetSpellValidIndex() {
        assertEquals("Accio", spellbook.getSpell(1));
    }

    @Test
    void testGetSpellInvalidIndex() {
        assertNull(spellbook.getSpell(-1));
        assertNull(spellbook.getSpell(10));
    }

    @Test
    void testGetSpellsByExactPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("Alo");
        assertEquals(Collections.singletonList("Alohomora"), result);
    }

    @Test
    void testGetSpellsByEmptyPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("");
        assertEquals(3, result.size());
    }

    @Test
    void testGetSpellsByNoMatch() {
        List<String> result = spellbook.getSpellsByPrefix("Zzz");
        assertTrue(result.isEmpty());
    }
}

package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Represents a spellbook containing all known spells.
 */
public class Spellbook {
    private List<String> spells;
    /**
     * Creates a new spellbook.
     */
    public Spellbook() {
        spells = new ArrayList<>();
    }
    /**
     * Adds a spell to the spellbook.
     * _requires_: spell is not null and not already in the list
     * _effects_: adds the spell if not already present
     * @param spell The spell to add.
     */
    public void addSpell(String spell) {
        if (spell != null && !spells.contains(spell)) {
            spells.add(spell);
        }
    }
    /**
     * Retrieves a spell by its index.
     * _requires_: index is within valid range (0 <= index < spells.size())
     * _effects_: returns the spell at the given index
     * @param index The index of the spell.
     * @return The spell at the given index or null if out of bounds.
     */
    public String getSpell(int index) {
        if (index >= 0 && index < spells.size()) {
            return spells.get(index);
        }
        return null;
    }
    /**
     * Retrieves spells starting with a specific prefix.
     * _requires_: prefix is not null
     * _effects_: returns a list of spells that start with the given prefix
     * @param prefix The prefix to search for.
     * @return List of matching spells.
     */
    public List<String> getSpellsByPrefix(String prefix) {
        return spells.stream()
                .filter(spell -> spell.startsWith(prefix))
                .collect(Collectors.toList());
    }
}

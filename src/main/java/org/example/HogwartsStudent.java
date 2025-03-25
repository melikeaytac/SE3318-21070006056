package org.example;
import java.util.HashSet;
import java.util.Set;
/**
 * Represents a Hogwarts student with their spells.
 */
public class
HogwartsStudent {
    private String name;
    private String house;
    private int year;
    private Set<String> spellsLearned;
    /**
     * Creates a new Hogwarts student.
     * @param name The student's name.
     * @param house The house they belong to.
     * @param year The year they are in.
     */
    public HogwartsStudent(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new HashSet<>();
    }
    /**
     * Allows the student to learn a spell.
     * _requires_: spell is not null and not already known
     * _effects_: adds the spell to the learned spells if possible
     * @param spell The spell to learn.
     * @return true if learned successfully, false otherwise.
     */
    public boolean learnSpell(String spell) {
        if (spell == null || spellsLearned.contains(spell)) {
            return false;
        }
        spellsLearned.add(spell);
        return true;
    }
    /**
     * Checks if the student knows a given spell.
     * _requires_: spell is not null
     * _effects_: returns true if the spell is in the learned list
     * @param spell The spell to check.
     * @return true if the student knows the spell, false otherwise.
     */
    public boolean knowsSpell(String spell) {
        return spellsLearned.contains(spell);
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public int getYear() {
        return year;
    }

    public Set<String> getSpellsLearned() {
        return spellsLearned;
    }
}

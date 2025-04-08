package org.example;

// Mage.java
public class Mage extends Hero {

    public Mage(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println("Mage " + name + " says: Magic is the answer to everything.");
    }

    public void castSpell(String spellName) {
        System.out.println("Mage " + name + " casts " + spellName + "!");
    }
}

package org.example;

public class App {
    public static void main( String[] args ) {
        Mentor gandalf = new Mentor("Gandalf", "The Grey");
        Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");

        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring Bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");
        Adventurer legolas = new Adventurer("Legolas", "Prince of the Woodland Realm", "Elf");
        Adventurer gimli = new Adventurer("Gimli", "Son of Glóin", "Dwarf");

        Quest destroyRing = new Quest("Destroy the One Ring", "Legendary", gandalf);
        Quest defendHelmsDeep = new Quest("Defend Helm’s Deep", "Hard", elrond);

        frodo.joinQuest(destroyRing);
        aragorn.joinQuest(defendHelmsDeep);
        legolas.joinQuest(defendHelmsDeep);
        gimli.joinQuest(defendHelmsDeep);

        destroyRing.displayAdventurers();
        defendHelmsDeep.displayAdventurers();

        frodo.displayQuests();
        aragorn.displayQuests();
    }
}

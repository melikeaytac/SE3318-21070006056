package org.example;
import java.util.ArrayList;
import java.util.List;

class Quest {
    private String name;
    private String difficulty;
    private Mentor mentor;
    private List<Adventurer> adventurers;

    public Quest(String name, String difficulty, Mentor mentor) {
        this.name = name;
        this.difficulty = difficulty;
        this.mentor = mentor;
        this.adventurers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    public void displayAdventurers() {
        System.out.println("Adventurers in " + name + " quest:");
        for (Adventurer a : adventurers) {
            System.out.println("- " + a.getName());
        }
    }
}
package org.example;
import java.util.ArrayList;
import java.util.List;

class Adventurer extends Character implements Joinable {
    private String race;
    private List<Quest> quests;

    public Adventurer(String name, String title, String race) {
        super(name, title);
        this.race = race;
        this.quests = new ArrayList<>();
    }

    public void joinQuest(Quest quest) {
        quests.add(quest);
        quest.addAdventurer(this);
    }

    public void displayQuests() {
        System.out.println(name + "'s Quests:");
        for (Quest q : quests) {
            System.out.println("- " + q.getName());
        }
    }
}
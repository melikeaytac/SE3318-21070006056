package org.example;
import java.util.ArrayList;
import java.util.List;

public class Mentor extends Character {
    private List<Quest> quests = new ArrayList<>();

    public Mentor(String name, String title) {
        super(name, title);
    }

    public void addQuest(Quest quest) {
        quests.add(quest);
    }
}
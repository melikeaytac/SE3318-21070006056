package org.example;
public class Hero extends Character implements Questable {

    public Hero(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println("Hero " + name + " says: I'm ready for adventure!");
    }

    @Override
    public void acceptQuest(String questName) {
        System.out.println("Hero " + name + " has accepted the quest: " + questName);
    }
}

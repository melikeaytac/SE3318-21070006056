package org.example;
public class Warrior extends Hero {

    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println("Warrior " + name + " says: Strength and honor!");
    }

    public void attack() {
        System.out.println("Warrior " + name + " swings a mighty sword!");
}
}
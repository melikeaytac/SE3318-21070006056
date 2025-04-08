package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Hero hero = new Hero("Aragon", 10);
        Enemy enemy = new Enemy("Goblin", 5);

        hero.speak();
        enemy.speak();

        QuestBoard questBoard = new QuestBoard();
        questBoard.assignQuest(hero, "Save the Kingdom");

        BattleManager battleManager = new BattleManager();
        battleManager.battle(hero, enemy);
    }
}

package org.example;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {

        HogwartsStudent harry = new HogwartsStudent("Harry Potter", "Gryffindor", 3);
        HogwartsStudent draco = new HogwartsStudent("Draco Malfoy", "Slytherin", 3);
        HogwartsStudent hermione = new HogwartsStudent("Hermione Granger", "Gryffindor", 3);


        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Sectumsempra");
        hermione.learnSpell("Alohomora");


        System.out.println("Checking if Harry knows the a spell");
        System.out.println("Does Harry know Expelliarmus? " + harry.knowsSpell("Expelliarmus"));


        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Expelliarmus");
        spellbook.addSpell("Sectumsempra");
        spellbook.addSpell("Alohomora");
        System.out.println(" ");

        System.out.println("Filtering a spell by prefix");
        System.out.println("Spells starting with 'Ex': " + spellbook.getSpellsByPrefix("Ex"));

        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(harry);
        classroom.addStudent(draco);
        classroom.addStudent(hermione);


        System.out.println("Finding student by spell 'Sectumsempra': " + classroom.findStudentBySpell("Sectumsempra").getName());
        System.out.println(" ");

        System.out.println("Doing an exam");
        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus", "Alohomora"));
        exam.evaluate(harry);
        exam.evaluate(hermione);
        System.out.println(" ");

        System.out.println("Making duels");
        Duel.start(harry, draco, "Expelliarmus");
        Duel.start(harry, draco, "Sectumsempra");    }
}

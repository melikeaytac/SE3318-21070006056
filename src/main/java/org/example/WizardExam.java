package org.example;
import java.util.List;
/**
 * Represents a wizard exam with required spells.
 */
public class WizardExam {
    private List<String> requiredSpells;
    /**
     * Creates a new wizard exam.
     * _requires_: requiredSpells is not null
     * _effects_: initializes an exam with a list of required spells
     * @param requiredSpells The list of required spells.
     */
    public WizardExam(List<String> requiredSpells) {
        this.requiredSpells = requiredSpells;
    }
    /**
     * Checks if a student passes the exam.
     * _requires_: student is not null
     * _effects_: returns true if the student knows all required spells
     * @param student The student being evaluated.
     * @return true if the student passes, false otherwise.
     */
    public boolean pass(HogwartsStudent student) {
        return requiredSpells.stream().allMatch(student::knowsSpell);
    }
    /**
     * Evaluates a student's performance in the exam.
     * _requires_: student is not null
     * _effects_: prints whether the student passed or failed
     * @param student The student being evaluated.
     */
    public void evaluate(HogwartsStudent student) {
        if (pass(student)) {
            System.out.println(student.getName() + " passed the exam!");
        } else {
            System.out.println(student.getName() + " failed the exam.");
        }
    }
}

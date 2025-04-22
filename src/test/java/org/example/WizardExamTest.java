package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class WizardExamTest {
    private WizardExam exam;
    private HogwartsStudent student;

    @BeforeEach
    void setUp() {
        exam = new WizardExam(Arrays.asList("Lumos", "Expelliarmus"));
        student = new HogwartsStudent("Hermione", "Gryffindor", 3);
    }

    @Test
    void testPassAllSpellsKnown() {
        student.learnSpell("Lumos");
        student.learnSpell("Expelliarmus");
        assertTrue(exam.pass(student));
    }

    @Test
    void testFailWhenSpellsMissing() {
        student.learnSpell("Lumos");
        assertFalse(exam.pass(student));
    }

    @Test
    void testEvaluatePrintsCorrectly() {
        student.learnSpell("Lumos");
        student.learnSpell("Expelliarmus");
        exam.evaluate(student);
    }
}
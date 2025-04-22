package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MagicClassroomTest {
    private MagicClassroom classroom;
    private HogwartsStudent harry, draco;

    @BeforeEach
    void setUp() {
        classroom = new MagicClassroom();
        harry = new HogwartsStudent("Harry", "Gryffindor", 3);
        draco = new HogwartsStudent("Draco", "Slytherin", 3);
        harry.learnSpell("Lumos");
        draco.learnSpell("Crucio");
    }

    @Test
    void testAddValidStudent() {
        classroom.addStudent(harry);
        assertEquals(harry, classroom.findStudent("Harry"));
    }

    @Test
    void testAddNullStudent() {
        classroom.addStudent(null);
        assertNull(classroom.findStudent("null"));
    }

    @Test
    void testFindStudentByName() {
        classroom.addStudent(harry);
        HogwartsStudent found = classroom.findStudent("Harry");
        assertNotNull(found);
        assertEquals("Harry", found.getName());
    }

    @Test
    void testFindStudentBySpell() {
        classroom.addStudent(draco);
        assertEquals("Draco", classroom.findStudentBySpell("Crucio").getName());
    }

    @Test
    void testGetStudentsByHouse() {
        classroom.addStudent(harry);
        List<HogwartsStudent> gryffindorStudents = classroom.getStudentsByHouse("Gryffindor");
        assertEquals(1, gryffindorStudents.size());
        assertEquals("Harry", gryffindorStudents.get(0).getName());
    }

    @Test
    void testGetStudentsSortedByHouse() {
        classroom.addStudent(draco);
        classroom.addStudent(harry);
        List<HogwartsStudent> sorted = classroom.getStudentsSortedByHouse();
        assertEquals("Draco", sorted.get(0).getName());
        assertEquals("Harry", sorted.get(1).getName());
    }
}
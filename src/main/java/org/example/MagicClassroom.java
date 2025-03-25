package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Represents a magic classroom containing students.
 */
public class MagicClassroom {
    private List<HogwartsStudent> students;
    /**
     * Creates a new magic classroom.
     */
    public MagicClassroom() {
        students = new ArrayList<>();
    }
    /**
     * Adds a student to the classroom.
     * _requires_: student is not null
     * _effects_: adds the student to the list if valid
     * @param student The student to add.
     */
    public void addStudent(HogwartsStudent student) {
        if (student != null) {
            students.add(student);
        }
    }
    /**
     * Finds a student by name.
     * _requires_: name is not null
     * _effects_: returns the first student with the matching name or null if not found
     * @param name The name of the student to find.
     * @return The matching HogwartsStudent or null if not found.
     */
    public HogwartsStudent findStudent(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    /**
     * Finds the first student who knows a specific spell.
     * _requires_: spell is not null
     * _effects_: returns the first student who knows the spell or null if no student knows it
     * @param spell The spell to search for.
     * @return The first student who knows the spell or null if not found.
     */
    public HogwartsStudent findStudentBySpell(String spell) {
        return students.stream()
                .filter(s -> s.knowsSpell(spell))
                .findFirst()
                .orElse(null);
    }
    /**
     * Retrieves a list of students belonging to a specific house.
     * _requires_: house is not null
     * _effects_: returns a list of students who belong to the specified house
     * @param house The house to filter students by.
     * @return List of students in the specified house.
     */
    public List<HogwartsStudent> getStudentsByHouse(String house) {
        return students.stream()
                .filter(s -> s.getHouse().equalsIgnoreCase(house))
                .collect(Collectors.toList());
    }
    /**
     * Retrieves a sorted list of students by their house.
     * _requires_: none
     * _effects_: returns a list of students sorted alphabetically by house name
     * @return Sorted list of students by house.
     */
    public List<HogwartsStudent> getStudentsSortedByHouse() {
        return students.stream()
                .sorted((s1, s2) -> s1.getHouse().compareToIgnoreCase(s2.getHouse()))
                .collect(Collectors.toList());
    }
}

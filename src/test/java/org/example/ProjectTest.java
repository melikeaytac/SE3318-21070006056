package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {
    @Test
    public void testAddUserAndRetrieve() {
        Project project = new Project();
        User user = new User("bob", "bob@example.com");
        project.addUser(user);
        assertTrue(project.getUsers().contains(user));
    }

    @Test
    public void testAddAndGetTaskByTitle() {
        Project project = new Project();
        Task task = new Task("Setup CI", LocalDate.now());
        project.addTask(task);
        assertEquals(task, project.getTaskByTitle("Setup CI"));
    }
}
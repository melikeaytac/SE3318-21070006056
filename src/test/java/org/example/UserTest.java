package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testAddAndHasTask() {
        User user = new User("bob", "bob@example.com");
        Task task = new Task("Code review", LocalDate.now().plusDays(1));
        user.addTask(task);
        assertTrue(user.hasTask("Code review"));
    }

    @Test
    public void testRemoveTask() {
        User user = new User("alice", "alice@example.com");
        Task task = new Task("Debug", LocalDate.now());
        user.addTask(task);
        user.removeTask(task);
        assertFalse(user.hasTask("Debug"));
    }

    @Test
    public void testGetTasksReturnsCopy() {
        User user = new User("john", "john@example.com");
        Task task = new Task("Deploy", LocalDate.now());
        user.addTask(task);
        List<Task> copy = user.getTasks();
        copy.clear();
        assertFalse(copy.contains(task));
        assertTrue(user.getTasks().contains(task));
    }
}

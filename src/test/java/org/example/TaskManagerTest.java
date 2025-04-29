package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    @Test
    public void testAssignTask() {
        TaskManager manager = new TaskManager();
        User user = new User("dave", "dave@example.com");
        Task task = new Task("Fix bug", LocalDate.now());
        manager.assignTaskToUser(task, user);
        assertTrue(user.hasTask("Fix bug"));
    }


    @Test
    public void testListUserTasks() {
        TaskManager manager = new TaskManager();
        User user = new User("mark", "mark@example.com");
        Task task = new Task("Write doc", LocalDate.now());
        manager.assignTaskToUser(task, user);
        List<Task> tasks = manager.listUserTasks(user);
        assertEquals(1, tasks.size());
        assertEquals("Write doc", tasks.get(0).getTitle());
    }
}

package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

public class TaskTest {
    @Test
    public void testMarkCompleted() {
        Task task = new Task("Finish lab", LocalDate.now().plusDays(1));
        task.markCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    public void testIsOverdue() {
        Task task = new Task("Old task", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }
}
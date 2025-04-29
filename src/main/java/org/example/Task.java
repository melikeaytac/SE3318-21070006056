package org.example;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean isCompleted;




    /**
     * Requires: title != null, dueDate != null
     * Effects: Initializes a new task with the given title and due date.
     */
    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }


    /**
     * Requires: none
     * Effects: Returns true if the task is overdue (due date before today and not completed).
     */
    public boolean isOverdue() {
        return !isCompleted && dueDate.isBefore(LocalDate.now());
    }

    /**
     * Requires: none
     * Effects: Marks this task as completed.
     */
    public void markCompleted() {
        this.isCompleted = true;
    }


    /**
     * Requires: none
     * Effects: Returns the title of the task.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Requires: none
     * Effects: Returns the due date of the task.
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Requires: none
     * Effects: Returns true if the task is marked as completed.
     */
    public boolean isCompleted() {
        return isCompleted;
    }
}

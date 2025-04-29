package org.example;

import java.util.List;

public class TaskManager {
    /**
     * Requires: task != null, user != null
     * Effects: Assigns the task to the user.
     */
    public void assignTaskToUser(Task task, User user) {
        user.addTask(task);
    }
    /**
     * Requires: user != null
     * Effects: Returns a list of all tasks assigned to the user.
     */
    public List<Task> listUserTasks(User user) {
        return user.getTasks();
    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    /**
     * Requires: username != null, email != null
     * Effects: Initializes a new user with the given username and email.
     */
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    /**
     * Requires: task != null
     * Effects: Adds the given task to the user's task list.
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Requires: taskTitle != null
     * Effects: Returns true if the user has a task with the given title.
     */
    public boolean hasTask(String taskTitle) {
        return tasks.stream().anyMatch(t -> t.getTitle().equals(taskTitle));
    }

    /**
     * Requires: none
     * Effects: Returns a copy of the user's task list.
     */
    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }


    /**
     * Requires: task != null
     * Effects: Removes the task from the user's task list if present.
     */
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    /**
     * Requires: none
     * Effects: Returns the user's username.
     */
    public String getUsername() {
        return username;
    }


    /**
     * Requires: none
     * Effects: Returns the user's email.
     */
    public String getEmail() {
        return email;
    }
}
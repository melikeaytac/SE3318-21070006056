package org.example;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<User> users;
    private List<Task> tasks;

    /**
     * Requires: none
     * Effects: Initializes an empty project.
     */
    public Project() {
        users = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    /**
     * Requires: user != null
     * Effects: Adds the given user to the project.
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Requires: task != null
     * Effects: Adds the given task to the project.
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Requires: title != null
     * Effects: Returns the task with the given title if it exists; otherwise null.
     */
    public Task getTaskByTitle(String title) {
        return tasks.stream().filter(t -> t.getTitle().equals(title)).findFirst().orElse(null);
    }
    /**
     * Requires: none
     * Effects: Returns a copy of the list of users in the project.
     */
    public List<User> getUsers() {
        return new ArrayList<>(users);
    }
    /**
     * Requires: none
     * Effects: Returns a copy of the list of tasks in the project.
     */
    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}
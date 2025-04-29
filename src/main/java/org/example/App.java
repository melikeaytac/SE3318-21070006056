package org.example;

import java.time.LocalDate;

public class App 
{

        public static void main(String[] args) {
            User alice = new User("alice", "alice@example.com");
            Task task1 = new Task("Submit report", LocalDate.now().plusDays(2));

            TaskManager manager = new TaskManager();
            NotificationService notifier = new NotificationService();

            manager.assignTaskToUser(task1, alice);
            notifier.sendNotification(alice, "New task assigned: " + task1.getTitle());

            System.out.println("Tasks for " + alice.getUsername() + ":");
            for (Task t : manager.listUserTasks(alice)) {
                System.out.println("- " + t.getTitle() + " (Due: " + t.getDueDate() + ")");
            }

            System.out.println("Notifications:");
            for (String note : notifier.getNotifications(alice)) {
                System.out.println("* " + note);
            }
        }
    }

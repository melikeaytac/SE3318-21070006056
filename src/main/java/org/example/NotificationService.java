package org.example;

import java.util.*;

public class NotificationService {
    private Map<User, List<String>> notifications;



    /**
     * Requires: none
     * Effects: Initializes the notification service.
     */
    public NotificationService() {
        notifications = new HashMap<>();
    }

    /**
     * Requires: user != null, message != null
     * Effects: Sends the message to the given user.
     */
    public void sendNotification(User user, String message) {
        notifications.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
    }

    /**
     * Requires: user != null
     * Effects: Returns a list of all messages sent to the user.
     */
    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user, new ArrayList<>());
    }
}
package org.example;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {
    @Test
    public void testSendAndRetrieveNotification() {
        NotificationService service = new NotificationService();
        User user = new User("emma", "emma@example.com");
        service.sendNotification(user, "Task assigned: Design UI");
        List<String> notifications = service.getNotifications(user);
        assertTrue(notifications.contains("Task assigned: Design UI"));
    }
}
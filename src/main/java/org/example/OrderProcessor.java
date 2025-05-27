package org.example;

import java.util.List;

public class OrderProcessor {
  public void processOrder(String orderId, List<String> items) {
    if (orderId == null || orderId.isBlank()) {
      System.out.println("Order ID is invalid");
      return;
    }

    if (items == null || items.isEmpty()) {
      System.out.println("No items to process for order: " + orderId);
      return;
    }

    if (orderId.length() > 5) {
      System.out.println("Processing complex order: " + orderId);
    } else {
      System.out.println("Processing order: " + orderId);
    }

    for (String item : items) {
      if (item != null && item.contains("item")) {
        System.out.println("Valid item: " + item);
      } else {
        System.out.println("Skipping invalid item");
      }
    }
  }

}
package org.example;

public class UserValidator {
  public boolean validateUser(String name, int age, String email) {
    if (name == null || name.isBlank()) {
      System.out.println("Name is missing");
      return false;
    } else if (name.length() < 2) {
      System.out.println("Name too short");
      return false;
    }

    if (age < 0 || age > 120) {
      System.out.println("Age is out of range");
      return false;
    }

    if (email == null || !email.contains("@") || !email.contains(".")) {
      System.out.println("Email is invalid");
      return false;
    }

    return true;
  }

}
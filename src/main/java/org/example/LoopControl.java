package org.example;

/**
 * Contains loop usage examples for both correct and incorrect Checkstyle compliance.
 */
public class LoopControl {

  public void incorrectVariableUsage() {
    int index;
    // Some other code
    System.out.println("Preparing to loop...");
    // Loop starts much later after declaration
    index = 0;
    for (; index < 5; index++) {
      System.out.println(index);
    }
  }

  public void avoidEmptyBlock() {
    for (int j = 0; j < 10; j++) {
      if (j == 5) {
        System.out.println("Midpoint at: " + j);
      } else {
        // empty block - violation
      }
    }
  }

  public void modifiedControlVariable() {
    for (int m = 0; m < 10; m++) {
      if (m == 5) {
        System.out.println("Adjusting loop index from " + m);
        m += 3; // Incorrect - modifying control variable inside the loop
        System.out.println("to " + m);
      }
    }
  }

  /**
   * Correctly calculates the sum of squares of the first 10 positive integers.
   * Demonstrates proper variable declaration and loop usage.
   */
  public void sumOfSquares() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i * i;
    }
    System.out.println("Sum of squares (1-10): " + sum);
  }

  /**
   * Correctly prints a right-angled triangle made of asterisks with 5 lines.
   * No empty blocks, fully compliant.
   */
  public void printTriangle() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /**
   * Stub method added for compatibility with App.java.
   * You may implement correct logic if needed.
   */
  public void correctVariableUsage() {
    System.out.println("Correct variable usage method is not implemented.");
  }

  /**
   * Stub method added for compatibility with App.java.
   * You may implement correct logic if needed.
   */
  public void correctlyModifiedControlVariable() {
    System.out.println("Correctly modified control variable method is not implemented.");
  }
}

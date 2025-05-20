package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Smoke tests for Week 12 project components.
 */
public class AppTest extends TestCase {

  /**
   * Constructs the test case with a name.
   *
   * @param testName the name of the test case
   */
  public AppTest(String testName) {
    super(testName);
  }

  /**
   * Bundles the tests together for execution.
   *
   * @return a suite of tests
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  /**
   * Tests that LoopControl methods can execute without exception.
   */
  public void testLoopControlMethods() {
    LoopControl lc = new LoopControl();

    lc.incorrectVariableUsage();
    lc.avoidEmptyBlock();
    lc.modifiedControlVariable();
    lc.sumOfSquares();
    lc.printTriangle();

    assertTrue(true); // If no exceptions thrown, test passes
  }

  /**
   * Tests that ExampleUsage methods return expected basic results.
   */
  public void testExampleUsageMethods() {
    ExampleUsage eu = new ExampleUsage();

    eu.displayEvenNumbers(); // Should print even numbers
    int sum = eu.sumArray();
    assertEquals(75, sum); // 5 + 10 + 15 + 20 + 25

    eu.processMatrix(); // Should print matrix elements

    int evenCount = eu.filterAndCountEvenNumbers();
    assertEquals(10, evenCount); // Numbers 2, 4, ..., 20

    int diagonalSum = eu.matrixDiagonalSum();
    assertEquals(15, diagonalSum); // 1 + 5 + 9

    assertTrue(true); // If no issues occurred
  }
}

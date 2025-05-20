package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates correct and practical use of loops for data filtering,
 * summation, and matrix processing.
 */
public class ExampleUsage {

  // Method to demonstrate using loops to filter data
  public void displayEvenNumbers() {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // Display even numbers only
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.println("Even number: " + number);
      }
    }
  }

  // Method to sum an array of integers demonstrating the use of loops and variable scope
  public int sumArray() {
    int[] numbers = {5, 10, 15, 20, 25};
    int sum = 0; // Correct usage of variable scope
    for (int num : numbers) {
      sum += num;
    }
    System.out.println("Sum of array: " + sum);
    return sum;
  }

  // Example of using nested loops to process multidimensional data
  public void processMatrix() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Iterate over each row and column of the matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
      }
    }
  }

  /**
   * Task 4: Filters even numbers from 1 to 20 and counts them.
   *
   * @return the number of even integers between 1 and 20
   */
  public int filterAndCountEvenNumbers() {
    List<Integer> numbers = new ArrayList<Integer>();
    for (int i = 1; i <= 20; i++) {
      numbers.add(i);
    }

    int count = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        count++;
      }
    }

    return count;
  }

  /**
   * Task 5: Calculates the sum of the diagonal elements of a 3x3 matrix.
   *
   * @return the sum of the main diagonal elements
   */
  public int matrixDiagonalSum() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }

    return sum;
  }
}

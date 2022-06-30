
/*
File Name: main.java
Name: Amar Panjwani
Description: This programs calculates the sum, difference, product, average, distance, and max and min for 2 user-inputted double values.
Date: 03/02/21
Email: panjwania@student.vvc.edu
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {

    Scanner in = new Scanner(System.in);

    System.out.print("Please enter two numbers with decimal values, separated by spaces (i.e. 2.5 3.1): ");
    double num1 = in.nextDouble();
    double num2 = in.nextDouble();

    System.out.println("Sum: " + (num1 + num2));
    System.out.println("Difference: " + (num1 - num2));
    System.out.println("Product: " + (num1 * num2));
    System.out.println("Average: " + ((num1 + num2) / 2));
    System.out.println("Distance: " + Math.abs(num1 - num2));
    System.out.println("Max: " + Math.max(num1, num2));
    System.out.println("Min: " + Math.min(num1, num2));

  }
}
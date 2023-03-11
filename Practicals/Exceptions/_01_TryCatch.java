package Exceptions;

import java.util.*;

public class _01_TryCatch {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      try {
        System.out.println("Enter X: ");
        int x = sc.nextInt();

        System.out.println("Enter Y: ");
        int y = sc.nextInt();

        System.out.println("The Result Is: " + (x / y));
      } catch (InputMismatchException e) { // To Handle Exception
        System.out.println("InputMismatchException Error Occurred \n" + e);
      }
    } catch (ArithmeticException e) { // To Handle Exception
      System.out.println("ArithmeticException Error Occurred \n" + e);
    }
  }
}

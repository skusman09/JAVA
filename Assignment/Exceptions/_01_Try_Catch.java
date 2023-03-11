/*You will be given two integers x and y as input, you have to compute x/y.
If x and y are not 32 bit signed integers or if y is zero,
exception will occur and you have to report it.
Read sample Input/Output to know what to report in case of exceptions.
Sample Input 0:
10
3
Sample Output 0:
3
Sample Input 1:
10
Hello
Sample Output 1:
java.util.InputMismatchException
Sample Input 2:
10
0
Sample Output 2:
java.lang.ArithmeticException: / by zero
Sample Input 3:
23.323
0
Sample Output 3:
java.util.InputMismatchException */

package Exceptions;

import java.util.*;

public class _01_Try_Catch {

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

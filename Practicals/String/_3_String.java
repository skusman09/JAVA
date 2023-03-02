/*Lecture 3rd */
/*String myString = "Hello World!"
The elements of a String are called characters.
The number of characters in a String is called the length,
and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, 
A and B, perform the following operations:
*/

import java.util.*;

public class _3_String {

  static Scanner sc = new Scanner(System.in);

  static void string_Methods() {
    // 01. Sum the lengths of  A and B
    System.out.println("Enter 1st Word");
    String A = sc.nextLine();
    System.out.println("Enter 2nd Word");
    String B = sc.nextLine();

    System.out.println("----------------01--------------------");
    int sum = A.length() + B.length();
    System.out.println("The Sum Of 2 Words Is: " + sum);

    // 02. Determine if A is lexicographically larger than B

    String newstring = new String("Usman");
    System.out.println("Object String " + A.equals(newstring));

    System.out.println("Equal Ignore Case: " + A.equalsIgnoreCase(B));

    System.out.println("Equal: " + A.equals(B));

    /* 03. Determine if A is lexicographically larger than B
    (i.e.: does B come before A in the dictionary?).
    Capitalize the first letter in A and B and print
    them on a single line, separated by a space. */
    System.out.println("----------------03--------------------");
    if (A.compareTo(B) > 0) {
      System.out.println(A + " Come After " + B);
    } else if (A.compareTo(B) < 0) {
      System.out.println(A + " Come Bfore " + B);
    } else {
      System.out.println(A + " Are Same " + B);
    }
    System.out.println("--------------------------------------");

    System.out.println("Comparing: " + A.compareTo(B));
  }

  public static void main(String[] args) {
    string_Methods();
  }
}

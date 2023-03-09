// Friday- 09/03/2023
package JAVA_LAB.Lab6;

public class StringExample {

  public static void main(String[] args) {
    // Problem Statement 1:
    System.out.println("\t~~Problem Statement 01~~");
    String str = "Welcome to Java World";

    // 1-A: Character at 5th position
    // Using charAt Method
    System.out.println("A- Character at 5th position: " + str.charAt(5));

    // 1-B: Compares the above String with "Welcome" lexicographically ignoring case differences
    // Using "compareToIgnoreCase" Method
    System.out.println(
      "B- Compares ignoring case: " + str.compareToIgnoreCase("Welcome")
    );

    // 1-C: Concatenation two string
    // using "concat" Method
    System.out.println("C- Concatenation: " + str.concat(" - Let us learn"));

    // 1-D: Positioning of the first occurrence of character 'a'
    // Using "indexOf" Method
    System.out.println(
      "D- First occurrence of character 'a' : " + str.indexOf('a')
    );

    // 1-E: Replaces all the occurrences of 'a' character with the new 'e'
    // Using Replace Method
    System.out.println("E- Replacing 'a' to 'e' : " + str.replace("a", "e"));

    // 1-F: String between 4th position and 10th position
    // Using substring Method
    System.out.println(
      "F- String between 4th and 10th position: " + str.substring(3, 10)
    );

    // 1-G: Lowercase of the string
    System.out.println("G- Lowercase of the string: " + str.toLowerCase());

    // *******Problem Statement 2:********
    System.out.println("\n\t~~Problem Statement 02~~");

    StringBuffer strbuff = new StringBuffer("This is StringBuffer");

    // 1. Adding the string "This is a sample program" to existing string.
    // Using append Method
    System.out.println(
      "1. Appending new string: " + strbuff.append(" This is a sample program")
    );

    // 2. Inserting the string "Object" into the existing string at 21st postion.
    // Using insert Method
    System.out.println(
      "2. Inserting the string: " + strbuff.insert(21, "Object ")
    );

    // 3. Reversing the entire string.
    // Using reverse Method
    System.out.println("3. Reversing the entire string: " + strbuff.reverse());

    System.out.println(strbuff.reverse()); // For Problem-4 we Need To Reverse Back Problem-3
    
    // 4. Replacing the word "Buffer" with "Builder".
    // Using replace Method
    System.out.println(
      "4. Replacing 'Buffer' to 'Builder': " +
      strbuff.replace(14, 20, "Builder")
    );
  }
}

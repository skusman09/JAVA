// 2nd Lecture
// String Methods

public class _2_String {

  public static void main(String[] args) {
    String x = "Shaikh Mohammed Usman";
    String y = "Gani";

    System.out.println(x.toUpperCase()); // Transfer The Word In LowerCase
    System.out.println(x.toLowerCase()); // Transfer The Word In LowerCase
    System.out.println(x.charAt(5)); // Where Character Present
    System.out.println(x.substring(8)); // Sentence Start From 8th Index
    System.out.println(x.substring(8, 10)); // We Also Write Like This Sentence Start From 8th Index
    System.out.println(x.concat(" " + y)); // Adding Two Strings
    System.out.println(x.equals(y)); // Comparing String, If Different Sentence, Return False
    System.out.println(x.codePointCount(4, 10)); // Finding, How Many Character Present in Between
    System.out.println(x.startsWith("S")); // Display True
    System.out.println(x.startsWith("s")); // Display False Cozz.. "s" is Small, But Our String Start With Capital "S"
    System.out.println(x.endsWith("n")); // Display True
    System.out.println(x.endsWith("N")); // Display False Cozz.. "N" is Capital, But Our String End With small "n"
    System.out.println(x.length()); // Print Total Number Of Character Present In String

    int num = 46;
    String z = String.valueOf(num); // Converting int To String
    System.out.println(String.valueOf(num + z) + 46);
  }
}

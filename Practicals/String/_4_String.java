/*
 01. String Buffer ---- Synchronized
 thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
 */

/*  String Builder ---- Non-Synchronized OR Asynchronized
not thread safe. It means two threads can call the methods of StringBuilder simultaneously.*/

public class _4_String {

  public static void main(String[] args) {
    StringBuffer strBuffer = new StringBuffer("Shaikh");
    System.out.println("insert:> " + strBuffer.insert(6, " Usman "));
    System.out.println("append:> " + strBuffer.append("Gani"));
    System.out.println("charAt:> " + strBuffer.charAt(8));
    System.out.println("Original:> " + strBuffer);

    StringBuilder strBuilder = new StringBuilder("Usman");
    System.out.println("insert:> " + strBuilder.insert(5, " Shaikh " + "<:Insert"));
    System.out.println("append:> " + strBuilder.append("Gani"));
    System.out.println("charAt:> " + strBuilder.charAt(8));
    System.out.println("Original:> " + strBuilder);
  }
}

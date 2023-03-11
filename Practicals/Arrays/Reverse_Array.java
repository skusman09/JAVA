// Reverse Array

public class Reverse_Array {

  public static void main(String[] args) {
    //Initialize array
    int[] arr = { 18, 99, 65, 78, 40, 29, 85, 98, 85 };
    System.out.println("\nOriginal array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " "); // Printing Original Array
    }

    System.out.println("\n\nArray in reverse order: ");
    //Loop through the array in reverse order
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}

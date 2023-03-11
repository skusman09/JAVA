// print largest, smallest element present in array

public class Largest_Smallest_Array {
    public static void main(String[] args) {
        int arr[] = { 45, 7, 85, 4, 12, 56, 121, 12 };
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest Number is: " + smallest);
        System.out.println("Largest Number is: " + largest);
    }
}
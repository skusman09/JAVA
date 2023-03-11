import java.util.*;

// Ascending Descending

public class Asc_Des {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 9, 7, 3, 0, 2, 5, 8, 6 };
        Arrays.sort(arr);
        System.out.print("Arrange In Ascending Order: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Arrange In Descending Order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
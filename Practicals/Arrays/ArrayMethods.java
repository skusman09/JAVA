import java.util.*;

public class ArrayMethods {
    static void arrayMethods() {

        int array[] = { 52, 65, 78, 45, 71 }; // Declaration and Initialisation
        System.out.println("5th Position's Array " + array[4]); // Printing 5th Position Value of Array

        // 01. Change Array Value
        System.out.println("Before Change " + array[2]); // 01. Change Array Value
        array[2] = 998;
        System.out.println("After Change " + array[2]);

        System.out.println("Before Change " + array[3]); // 01. Another Way To Change Array Value
        System.out.print("After Change ");
        System.out.println(array[3] = 859);
        System.out.println("\n");

        // 02. Sorting Array "Arrays.sort"
        System.out.println("Sorting Array");
        int arraySort[] = { 89, 58, 36, 45, 15, 32, 2, 7 };
        Arrays.sort(arraySort); // Sorting An Array
        for (int i = 0; i < arraySort.length; i++) {
            System.out.println(arraySort[i]);
        }

        // Find Index "Arrays.binarySearch"
        System.out.println("\nFind Number Present In Which Index");
        int intkey = 36;
        System.out.println(intkey + " Is Preset In " + Arrays.binarySearch(arraySort, intkey)); // Find Index

        // Printing Array Value In Square Brasis
        System.out.println("\nPrinting Array Values In Square Brasis ");
        int a[] = { 45, 14, 5, 2, 665, 85, 96 };
        System.out.println(Arrays.toString(a));

        // Clonig Array
        int clone[] = a.clone();
        System.out.println("\nClone Of The Array");
        for (int i : clone) {
            System.out.print(i + " ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        arrayMethods();
    }
}

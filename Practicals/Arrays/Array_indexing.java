// Take Input From User And Print Array

import java.util.*;;

public class Array_indexing {
    public static void main(String[] args) {

        // Creating Scanner For User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size = sc.nextInt();

        // Creating Array
        int array[] = new int[size];

        // Loop For Input
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter Above Number To Find Index");
        int x = sc.nextInt();  // Taking input For x

        // Loop For Finding "x"
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("found x in Index " + i);
            }
        }
    }
}

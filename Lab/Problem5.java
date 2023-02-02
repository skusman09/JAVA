// 5. Write a program to print Left down alphabet triangle pattern using loop.

import java.util.Scanner;

public class Problem5 {
    public void pattern(int input) {

        for (int i = input; i >= 0; i--) { // outer for loop

            for (int j = 0; j <= i; j++) { // inner for loop

                System.out.print("A" + " "); // prints star and space
            }

            // throws the cursor in the next line after printing each line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Problem5 obj = new Problem5(); // creating Object of class
        Scanner sc = new Scanner(System.in); // Using Scanner For Taking Input From User

        System.out.println("Enter Number of Rows To See Pattern: ");
        int input = sc.nextInt(); // Method For Taking Input From User
        obj.pattern(input); // Calling Method

    }
}

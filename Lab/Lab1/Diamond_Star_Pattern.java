/*4. Write a program to print an diamond star pattern using loop.
  02-02-2023
*/

import java.util.Scanner;

class Diamond_Star_Pattern {

    public void DiamondStar(int num) {

        // upper triangle
        for (int i = 1; i <= num; i++) {

            for (int j = num; j > i; j--) {
                System.out.print(" "); // printing spaces
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*"); // printing star
            }
            System.out.println();
        }

        // lower triangle
        for (int i = 1; i <= num - 1; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" "); // printing spaces
            }

            for (int k = (num - i) * 2 - 1; k > 0; k--) {
                System.out.print("*"); // printing star
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond_Star_Pattern obj = new Diamond_Star_Pattern(); // creating Object of class

        Scanner sc = new Scanner(System.in); // Using Scanner For Taking Input From User
        System.out.println("Enter Number Of Rows To See Pattern: ");
        int num = sc.nextInt(); // Method For Taking Input From User

        obj.DiamondStar(num); // Calling Method
    }
}
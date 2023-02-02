// 2. Write a program to Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40.

import java.util.Scanner;

public class Problem2 {

    public void Divisible(int num) { // Parameter
        if (num > 40) { // if condition
            System.out.println("\n\nDivided by 5: ");
            for (int i = 1; i < 100; i++) { // For loop begin
                if (i % 5 == 0)
                    System.out.print(i + ", ");
            }
        } else {
            System.out.println("Wrong Input...!!! \n To See Answer, Enter Number Which is Greater Than 40");
        }
    }

    public static void main(String args[]) {
        Problem2 obj = new Problem2(); // creating Object of class

        Scanner sc = new Scanner(System.in); // Using Scanner For Taking Input From User
        System.out.println("Enter Number: ");
        int num = sc.nextInt(); // Method For Taking Input From User

        obj.Divisible(num); // Calling Method
    }
}
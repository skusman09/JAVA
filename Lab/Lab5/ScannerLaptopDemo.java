//LAB 5: Claculator
/* 02/03/2023  
|Author: SHAIKH MOHAMMED USMAN

Scenario: A kids laptop manufacturer needs to develop a laptop which will display a message first,
Enter Option:
Add-1
Subtract-2
Multiply-3
Even/OddNumber -4
Quit-5

The kid should be allowed to enter an option. If the kid enters 1, a message needs to be displayed,
“Enter two numbers to be added”.
The kid should be allowed to enter two numbers (In two separate lines).
Based on the numbers entered, the program should add and display the result as below
“The result is <result>”
After the result is displayed, the program should loop back and ask for the next menu entry.
If the kid enters  5, the program should quit.
(The program needs to be executed and do either one of the options until the kid enters the option 5)
 */

import java.util.Scanner; // Java Scanner Class

class ScannerLaptopDemo {
    static Scanner sc = new Scanner(System.in); // Creating Object Of Scanner Class
    static int option; // Instance Variable
    static char wish; // Instance Variable

    static void calculator() { // This is An Options Which Is Display For Kid
        String calculator[] = {
                "1. Addition ",
                "2. Subtraction",
                "3. Multiplication",
                "4. Even/Odd Number",
                "5. Quit" };

        do {
            for (int i = 0; i < calculator.length; i++) { // Displaying Array USing For Loop
                System.out.println(calculator[i]);
            }

            System.out.println("\nEnter Option: ");
            option = sc.nextInt(); // Object Of Scanner Class

            switch (option) { // Here We Go With Switch Statement
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Enter Two Numbers To Be Added: ");
                    double num1 = sc.nextDouble(); // Object Of Scanner Class
                    double num2 = sc.nextDouble(); // Object Of Scanner Class
                    System.out.println("The Result Is: " + (num1 + num2));
                    System.out.println("___________________________");
                    break;

                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Enter Two Numbers To Be Subtracted: ");
                    num1 = sc.nextDouble(); // Object Of Scanner Class
                    num2 = sc.nextDouble(); // Object Of Scanner Class
                    System.out.println("The Result Is: " + (num1 - num2));
                    System.out.println("___________________________");
                    break;

                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Enter Two Numbers To Be Multiplied: ");
                    num1 = sc.nextDouble(); // Object Of Scanner Class
                    num2 = sc.nextDouble(); // Object Of Scanner Class
                    System.out.println("The Result Is: " + (num1 * num2));
                    System.out.println("___________________________");
                    break;

                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Enter Numbers To Check Even or Odd");
                    num1 = sc.nextDouble(); // Object Of Scanner Class
                    if (num1 % 2 == 0) {
                        System.out.println("Your Number Is Even");
                    } else {
                        System.out.println("Your Number Is Odd");
                    }
                    System.out.println("___________________________");
                    break;

                case 5:
                    System.out.println("-------------------------");
                    System.out.println("Good Bye...\n\t~Thanks For Using Calculator");
                    break;

                default:
                    System.out.println("~~Please Choose Correct Option~~\n");
                    break;
            }
        } while (option != 5);

    }

    public static void main(String[] args) {
        calculator(); // Invoking Static Method
    }
}
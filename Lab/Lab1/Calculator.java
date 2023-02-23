
/* 1. Write a program to design an Calculator using switch case.
02-02-2023
*/
import java.util.Scanner;

public class Calculator {

    public void calc(char operator, double num1, double num2) { // parameters

        double result = 0; // Declaration

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is: \n" + num1 + " + " + num2 + " = " + result);
                break; // break After Printing Case '+'

            case '-':
                result = num1 - num2;
                System.out.println("Subtraction is: \n" + num1 + " - " + num2 + " = " + result);
                break; // break After Printing Case '-'

            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is: \n" + num1 + " * " + num2 + " = " + result);
                break; // break After Printing Case '*'

            case '/':
                result = num1 / num2;
                System.out.println("Division is: \n" + num1 + " / " + num2 + " = " + result);
                break; // break After Printing Case '/'

            case '%':
                result = num1 % num2;
                System.out.println("Modulo is: \n" + num1 + " % " + num2 + " = " + result);
                break; // break After Printing Case '%'

            default:
                System.out.println("INVALID OPERATOR"); // default case run when user Enter Wrong Input.
        }
    }

    public static void main(String args[]) {
        Calculator obj = new Calculator(); // creating Object of class

        Scanner inpt = new Scanner(System.in); // Using Scanner For Taking Input From User
        System.out.println("Enter first number: ");
        double num1 = inpt.nextDouble(); // Method For Taking Input From User

        System.out.println("Enter second number: ");
        double num2 = inpt.nextDouble(); // Method For Taking Input From User

        System.out.println("Enter operator: +  -  *  /   %");
        char operator = inpt.next().charAt(0);

        obj.calc(operator, num1, num2); // Calling Method

    }
}
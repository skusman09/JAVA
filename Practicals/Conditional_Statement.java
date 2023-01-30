import java.util.Scanner;

class Conditional_Statement {

    // // *****if statement*****
    public void if_statement(int num) {

        if (num > 0) {
            System.out.println(num + " is greater zero\n\n");
        }
    }

    // // *********if else*********
    public void if_else(int age) {

        if (age > 18) {
            System.out.println("You Are Adult\n\n");
        } else {
            System.out.println("You Are Not Adult\n\n");
        }
    }

    // // Nested If else
    public void nested_if_else(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is Even\n");

            if (a >= 30) {
                System.out.println(a + " is Greater Than 30\n\n");
            } else {
                System.out.println(a + " is Not Greater Than 30\n\n");
            }
        } else {
            System.out.println(a + " is odd\n\n");
        }
    }

    // // *********Ladder else if*********
    public void ladder_else_if(int marks) {

        if (marks <= 100 && marks >= 80) {
            System.out.println("Outstanding\n");

        } else if (marks <= 79.99 && marks >= 70) {
            System.out.println("Exelent\n");

        } else if (marks <= 69.99 && marks >= 60) {
            System.out.println("Very Good\n");

        } else if (marks <= 59.99 && marks >= 55) {
            System.out.println("Good\n");

        } else if (marks <= 54.99 && marks >= 50) {
            System.out.println("Above Average\n");

        } else if (marks <= 49.99 && marks >= 45) {
            System.out.println("Average\n");

        } else if (marks <= 44.99 && marks >= 40) {
            System.out.println("Pass\n");

        } else if (marks < 40) {
            System.out.println("Fail\n");
        } else {
            System.out.println("Wrong Input\n");
        }

    }

    public static void main(String[] args) {

        Conditional_Statement obj = new Conditional_Statement();
        Scanner sc = new Scanner(System.in);

        System.out.println("---------if statement-----------");
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        obj.if_statement(num);

        System.out.println("----------if else statement----------");
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        obj.if_else(age);

        System.out.println("---------------Nested If else---------------");
        System.out.println("Enter Any Number To Know Even Odd");
        int a = sc.nextInt();
        obj.nested_if_else(a);

        System.out.println("---------------Ladder else if---------------");
        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();
        obj.ladder_else_if(marks);

    }
}
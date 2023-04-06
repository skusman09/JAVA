/*  30/03/2023 LAB-09
      -:Authored By Mohammed Usman:-

 => Q2. Create two threads to print odd numbers
 and even numbers from 1 to 100?
 note: after printing of all odd numbers only Even numbers should print.
 */

// Odd Number Class
class Odd_Number extends Thread {

    // This Is Runnable Interface's Method "run()",
    // It Is Executed By Thread When It Is Started.
    public void run() {

        // Heading For 'ODD' Number.
        System.out.println("\t     *********ODD Numbers*********");

        // Using For Loop To Traverse Odd Numbers.
        for (int i = 1; i <= 100; i++) {

            // Condition For Printing Only 'Odd' Number Between 1-100.
            if (i % 2 != 0) {
                // Printing Odd Number.
                System.out.print(i + " ");
            }
        }
        // For Next Line
        System.out.println("\n\n");
    }
}

// Even Number Class
class Even_Number extends Thread {

    // This Is Runnable Interface's Method "run()",
    // It Is Executed By Thread When It Is Started.
    public void run() {

        // Heading For 'EVEN' Number.
        System.out.println("\t     *********EVEN Numbers*********");

        // Using For Loop To Traversing For Even Numbers.
        for (int i = 1; i <= 100; i++) {

            // Condition For Printing Only 'Even' Number Between 1-100.
            if (i % 2 == 0) {
                // Printing Even Numbers.
                System.out.print(i + " ");
            }
        }
    }
}

// Main Class
public class Question_02 {
    // Main Method
    public static void main(String[] args) {

        // Creating Object Of Class 'Odd_Number'.
        Odd_Number odd = new Odd_Number();

        // This Is Synchronized Method.
        // Start() Method Calls The run() Method Of Runnable Interface.
        odd.start();

        // Using 'Try' Block For Escape From Error
        try { // Try Block

            // join() Used to Wait For A Thread To Complete
            // Its Execution First Before continuing Next Execution.
            odd.join();
        } catch (InterruptedException e) { // Catch Block For Exception
            e.printStackTrace();
        }

        // Creating Object Of Class 'Even_Number'.
        Even_Number even = new Even_Number();

        // This Is Synchronized Method.
        // Start() Method Calls The run() Method Of Runnable Interface.
        even.start();

    }
}

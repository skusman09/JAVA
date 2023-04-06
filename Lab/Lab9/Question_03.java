/* 30/03/2023 LAB-09
   -:Authored By Mohammed Usman:-
 Q3. Create a Thread which prints Multipication table of a
 given number and each number will be printed after 1 second delay.
 */

//  Class 'Multipication_table' Which Extend Thread.
class Multipication_table extends Thread {

    // This Is Runnable Interface's Method "run()",
    // It Is Executed By Thread When It Is Started.
    public void run() {

        // Declare Variable 'num'.
        int num = 25;

        // Using For-Loop For Traversing.
        for (int i = 1; i <= 10; i++) {

            // Printing Table With Formate
            System.out.println(num + " X " + i + " = " + i * num);

            // Using 'Try' Block For Escape From An Error
            try { // Try Block
                sleep(1000);
            } catch (InterruptedException e) { // This Is Catch Block
                e.printStackTrace();
            }
        }
    }
}

// Main Class Which Execution Thread
public class Question_03 {
    // Main Method
    public static void main(String[] args) {

        // Creating Object Of Class 'Multipication_table'.
        Multipication_table table = new Multipication_table();

        // This Is Synchronized Method.
        // Start() Method Calls The run() Method Of Runnable Interface.
        table.start();
    }
}

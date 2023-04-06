/* 30/03/2023 LAB-09
         -:Authored By Mohammed Usman:-
         
 => Q1. Create two thread, one thread is finding average of first 10 numbers
 and other thread is printing square of number,
 store in array arr={1,20,50,15,30}
 and make sure both thread can execute one by one.
 */

// 1-A. Calculation Average Of First 10 Number.
class Average_Number extends Thread {

    // This Is Runnable Interface's Method "run()",
    // It Is Executed By Thread When It Is Started.
    public void run() {

        // Declare Variable 'sum' It Store The Sum Of Array.
        double sum = 0;

        // Declare An Array Which Store Integer 10 Number.
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Using For Loop To Traverse An Array.
        for (int i = 0; i < arr.length; i++) {

            // Adding All Array Index Of Numbers And Store In 'sum'.
            sum += arr[i];
        }
        // After Adding 10 Numbers, Dividing By 10. --(By Average Rule)
        System.out.println("****Average Of First 10 Number****");
        System.out.println("\t\t" + sum / 10 + "\n\n");
    }
}

// 1-B. Square Of Numbers
class Square_Number extends Thread {

    // Runnable Interface's Method "run()",
    // It Is Executed By Thread When It Is Started.
    public void run() {

        // Declare Array Which Store Integer 5 Number.
        int arr[] = { 1, 20, 50, 15, 30 };

        // Using For Loop To Traverse The Array.
        System.out.println("*******Square Of Numbers*******");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t\t" + arr[i] * arr[i]);
        }

    }
}

// Main Class
public class Question_01 {

    // Main Method
    public static void main(String[] args) {

        // Creating Object Of Class 'Average_Number'.
        Average_Number avrage = new Average_Number();

        // This Is Synchronized Method.
        // Start() Method Calls The run() Method Of Runnable Interface.
        avrage.start();

        // Using TryCatch Block For Escape From Error
        try {

            // join() Used to Wait For A Thread To Complete
            // Its Execution First Before continuing Next Execution.
            avrage.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Creating Object Of Class 'Square_Number'
        Square_Number square = new Square_Number();

        // Start() Method Calls The run() Method Of Runnable Interface
        square.start();
    }
}
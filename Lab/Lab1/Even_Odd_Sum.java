/*3. Write a program to print even, odd, sum of natural number using for loop from 1-200.
   02-02-2023
*/
class Even_Odd_Sum {

    public void EvenOddSum() {
        int evenSum = 0, oddSum = 0; // declare variable

        for (int i = 1; i <= 200; i++) { // using for loop
            if (i % 2 == 0) { // if "i % 2" is equal to "zero" then it is an "even" number
                evenSum = evenSum + i;
            } else { // if "i % 2" is not equal to "zero" then it is an "even" number
                oddSum = oddSum + i;
            }
        }
        System.out.println("\n The Sum of Even Numbers is " + "  =  " + evenSum); // printing the value
        System.out.println("\n The Sum of Odd Numbers is " + "  =  " + oddSum); // printing the value
    }

    public static void main(String[] args) { // creating main class
        Even_Odd_Sum obj = new Even_Odd_Sum(); // creating Object of class
        obj.EvenOddSum(); // Calling Method
    }
}
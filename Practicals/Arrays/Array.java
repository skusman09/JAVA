// 1D Array
// In This Program We See
// Declare and Initialise Array , Printing Array(2 Types)

public class Array {

    static void array() {
        // Many Types To Creat An Array

        // 01. Type1
        // Here We Declare Array, We Can Also Use Float, Double And Etc.
        // We Use This Declaration When We Don't Know The Array Value
        int marks[] = new int[4];
        marks[0] = 87;
        marks[1] = 88;
        marks[2] = 95;
        marks[3] = 97;
        System.out.println("Normal Print");
        System.out.println(marks[2]); // Printing Array Normal
        System.out.println(marks[3]);
        System.out.println(marks[0]);

        // Printing All The Value Of Array Using For-LOOP
        System.out.println("Using For-LOOP");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(" ");

        // 02. Type2
        // Here We Declare Array, We Can Also Use Float, Double And Etc.
        // We Use This Declaration When We Know The Array Value
        String subject[] = { "Phy", "Chem", "Bio", "Maths" };
        System.out.println("Normal Print");
        System.out.println(subject[3]); // printing Array Normal
        System.out.println(subject[2]);
        System.out.println(subject[0]);

        /*
         * Printing All The Value Of Array Using ForEach-LOOP
         * Syntax
         * for (type variable : arrayname) {
         * }
         * eg. for(String i: usman){
         * System.out.println(i);
         * }
         */

        System.out.println("Using ForEach-LOOP");
        for (String j : subject) {
            System.out.println(j);
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        array();
    }
}
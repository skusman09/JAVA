public class Array2D {

    static void array() {

        // int MyArray2D[][] = new int[4][3]; // 4-Row And 3-Column

        int Array2D[][] = { { 91, 92, 93, 94 }, { 95, 96, 97, 98, 99, 100 } }; // 2D Array Declaration
        // printing 2D Array
        System.out.println("Printing 2D Array");

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                System.out.print(Array2D[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        array();
    }
}

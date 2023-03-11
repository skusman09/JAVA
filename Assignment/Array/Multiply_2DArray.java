// Example to multiply two matrices of 3 rows and 3 columns.
// Doubts Not Cleared

Fpublic class Multiply_2DArray {
    public static void main(String args[]) {
        // creating two matrices
        int a[][] = { { 3, 2, 4 }, { 3, 2, 1 }, { 4, 2, 3 } };
        int b[][] = { { 2, 3, 2 }, { 2, 2, 3 }, { 1, 4, 3 } };

        // creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3]; // 3 rows and 3 columns

        // multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                } // end of k loop
                System.out.print(c[i][j] + " "); // printing matrix element
            } // end of j loop
            System.out.println();// new line
        }
    }
}
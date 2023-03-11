// Simple Multiplication of metrix

public class Multiply_2Dmetrix {
    public static void main(String[] args) {
        int arr1[][] = { { 23, 12, 43 }, { 34, 54, 12 }, { 53, 41, 26 } };
        int arr2[][] = { { 94, 48, 41 }, { 32, 62, 17 }, { 68, 36, 29 } };
        int sum[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    sum[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

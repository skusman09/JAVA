// Simple Addition & Substraction of metrix

public class Add_2Dmetrix {
    public static void main(String[] args) {
        int arr1[][] = { { 23, 12, 43 }, { 34, 54, 12 }, { 53, 41, 26 } };
        int arr2[][] = { { 94, 48, 41 }, { 32, 62, 17 }, { 68, 36, 29 } };
        int sum[][] = new int[3][3];
        
        System.out.println("---------Addition------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\n---------Substraction------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

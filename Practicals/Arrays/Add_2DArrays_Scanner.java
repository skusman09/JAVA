// Adding 2D Arrays With User Input

import java.util.Scanner;

public class Add_2DArrays_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Matrix Row, Column");
        int sizeM1 = sc.nextInt();

        System.out.println("Enter Second Matrix Row, Column");
        int sizeM2 = sc.nextInt();

        int arr1[][] = new int[sizeM1][sizeM1];
        int arr2[][] = new int[sizeM2][sizeM2];

        // Array 01 // input
        System.out.println("Matrix 01");
        for (int i = 0; i < sizeM1; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // Array 01 // output
        for (int i = 0; i < sizeM1; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Array 02 // input
        System.out.println("\nMatrix 02");
        for (int i = 0; i < sizeM2; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        // Array 02 // output
        for (int i = 0; i < sizeM2; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Sum Of 2D array
        int sum[][] = new int[sizeM1][sizeM2];
        System.out.println("\nSum Of Tow Matrix Is: ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
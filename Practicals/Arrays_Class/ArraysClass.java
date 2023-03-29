// package Arrays_Class;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Arrays.fill(arr, 123);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

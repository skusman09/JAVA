public class Array_EvenOddNumber {
    static void oddEven() {
        int arr[] = { 65, 74, 23, 22, 31, 23, 78 };

        // For Even
        System.out.println("Even Numbers");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        // For Odd
        System.out.println("\nOdd Numbers");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        oddEven();
    }
}

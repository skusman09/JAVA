public class Array_OddEven_Position {
    static void oddEven() {
        int arr[] = { 65, 74, 23, 22, 31, 23, 78 };

        // For Even
        System.out.println("Even Position");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        // For Odd
        System.out.println("\nOdd Position");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        oddEven();
    }
}

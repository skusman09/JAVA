import java.util.Arrays;
import java.util.Random;

public class ArraysExample {

  public static void main(String[] args) {
    int a[] = { 11, 14, 13, 12, 15 };

    Arrays.sort(a);

    for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");

    Arrays.parallelSort(a);

    for (int val : a) System.out.println(val);

    int[] arr = new int[10];

    Arrays.fill(arr, 123);

    for (int val : arr) System.out.println(val);

    Random ran = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ran.nextInt(10);
    }

    int b = Arrays.compare(a, arr);
    System.out.println(b);

    boolean res = Arrays.equals(a, arr);
    System.out.println(res);

    /*
     * int re=Arrays.binarySearch(a, 12);
     * System.out.println(re);
     *
     * Arrays.copyOf(a, 12);
     * for(int val:a)
     * System.out.println(val+" ");
     */

    String arrval = Arrays.toString(a);
    System.out.println(arrval);
  }
}

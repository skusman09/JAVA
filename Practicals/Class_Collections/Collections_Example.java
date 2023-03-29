package Class_Collections;
// Collections

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collections_Example {
    public static void main(String[] args) {
        List<Integer> oldList = new LinkedList<>();
        oldList.add(40);
        oldList.add(32);
        oldList.add(75);
        oldList.add(1, 30);
        System.out.println("Normal: " + oldList);

        Collections.shuffle(oldList);
        System.out.print("shuffle: " + oldList);
        System.out.println();

        Collections.sort(oldList);
        System.out.print("Sort: " + oldList);
        System.out.println();

        Integer i = Collections.binarySearch(oldList, 40);
        System.out.println("binarySearch: " + i);

        Collections.reverse(oldList);
        System.out.println("Reverse: " + oldList);

        List<Integer> newList = new LinkedList<>();
        Collections.addAll(newList, 5, 8, 9, 6, 10, 78, 56);
        System.out.println("addAll: " + newList);

        int maxInt = Collections.max(newList);
        System.out.println("maxInt: " + maxInt);

        int minInt = Collections.min(newList);
        System.out.println("minInt: " + minInt);

        int frqncy = Collections.frequency(newList, oldList);
        System.out.println("Frequency: " + frqncy);
    }
}

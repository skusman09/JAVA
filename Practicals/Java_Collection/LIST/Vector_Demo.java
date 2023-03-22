package List.Vector;

import java.util.Arrays;
import java.util.Vector;

public class Vector_Demo {
    public static void main(String[] args) {
        Vector<Integer> vectorList = new Vector<>();
        // For Adding
        vectorList.add(41);
        vectorList.add(12);
        vectorList.add(88);
        vectorList.add(74);
        vectorList.add(19);
        vectorList.add(3, 34);
        System.out.println("Normal- add(): " + vectorList);

        // Noramal addAll
        vectorList.addAll(Arrays.asList(9, 2, 7, 6, 3));
        System.out.println("addAll(): " + vectorList);
        // addAll With Index
        vectorList.addAll(2, Arrays.asList(9, 2, 7, 6, 3));
        System.out.println("With Index addAll(): " + vectorList);

        // To Get The Element
        System.out.println("get(): " + vectorList.get(7));

        vectorList.capacity();
        System.out.println("capacity(): " + vectorList);

        // Clear all the element
        vectorList.clear();
        System.out.println("clear(): " + vectorList);
        // For Removing All Element
        vectorList.removeAllElements();
        System.out.println("removeAllElements: " + vectorList);

    }
}

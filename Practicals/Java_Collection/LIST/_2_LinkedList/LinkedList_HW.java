// H.W LinkedList
package _2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_HW {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(25);
        list.add(90);
        list.add(60);
        list.add(10);

        // Traverse Using toString
        System.out.println("toString: " + list.toString());

        // Traverse Using ForEach loop
        for (Integer a : list) {
            System.out.println("ForEach Loop: " + a);
        }

        // Traverse Using Enhanced ForEach loop
        System.out.print("Inhance ForEach: ");
        list.forEach(a -> System.out.print(a + " "));
        System.out.println();

        // Traverse Using Normal Forloop
        System.out.print("Normal Forloop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sort
        list.sort(null);
        System.out.println("Sort: " + list);

        // Traverse Using Iterator
        Iterator<Integer> itr = list.iterator();
        System.out.print("Iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Traverse Using ListIterator
        ListIterator<Integer> listItr = list.listIterator();
        System.out.print("ListIterator: ");
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }
        System.out.println();

        // Reverse
        System.out.print("Reverse Direction: ");
        listItr = list.listIterator(list.size());
        while (listItr.hasPrevious()) {
            System.out.print(listItr.previous() + " ");
        }

        // Remove The Value Direct
        list.remove(Integer.valueOf(90));
        System.out.println("\nRemove The Value Direct: " + list);

    }
}
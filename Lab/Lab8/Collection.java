package JAVA_LAB.Lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 23/03/2023
1. WAP to create an ArrayList , add Some Fruits name and traverse with any three ways.
2. Write a java Program to count the number of key-values mapping in map
3. WAP to remove 4th element from a ArrayList.
4. Wap to add element at mid of an LinkedList.
5. WAP a java program to swap to elements in arrayList.
*/

public class Collection {

    public static void Q1() {
        // 1. WAP to create an ArrayList, add Some Fruits name and traverse with any
        // three ways.
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dragon Fruit");
        list.add("Pineapple");
        // traverse with ForEach Loop
        System.out.println("Q1. Traversing with ForEach Loop: ");
        for (String a : list) {
            System.out.print(a + ", ");
        }
        System.out.println("\n");
    }

    public static void Q2() {
        // 2. Write a java Program to count the number of key-values mapping in map
        Map<Integer, String> mapList = new HashMap<>();
        mapList.put(1, "Usman");
        mapList.put(2, "Umar");
        mapList.put(3, "Maviya");
        mapList.put(4, "Amin");
        mapList.put(5, "Osama");
        System.out.println("Q2. The Count Of Key_Values: " + mapList.size() + "\n");
    }

    public static void Q3() {
        // WAP to remove 4th element from a ArrayList.
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Kiwi");
        arrayList.add("Pear");
        arrayList.add("Strawberry");
        System.out.println("Q3. Remove 4th Element: \n" + "    Before Removing: " + arrayList + "\n"
                + "    Removing 4th Position: " + arrayList.remove(3) + "\n" + "    After Removing: " + arrayList
                + "\n");
    }

    public static void Q4() {
        // Wap to add element at mid of an LinkedList.
        List<Integer> linkList = new LinkedList<>();
        linkList.add(15);
        linkList.add(45);
        linkList.add(74);
        linkList.add(63);
        System.out.println("Q4. Add Element at Mid Of LinkedList: ");
        System.out.println("    Before Adding" + linkList);
        linkList.add(2, 90);
        System.out.println("    After Adding" + linkList + "\n");
    }

    public static void Q5() {
        // WAP a java program to swap to elements in arrayList.
        List<String> arryList = new ArrayList<>();
        arryList.add("BMW");
        arryList.add("FORD");
        arryList.add("MINI");
        arryList.add("KIA");

        System.out.println("Q5. Swaping Element: \n    Before Swapping: " + arryList);
        Collections.swap(arryList, 1, 3);
        System.out.println("    After Swapping: " + arryList + "\n");
    }

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();

    }
}

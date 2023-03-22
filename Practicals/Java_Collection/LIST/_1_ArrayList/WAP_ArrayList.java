package _1_ArrayList;

import java.util.*;

public class WAP_ArrayList {
    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list,
        // Add some colors (string) and print out the collection.
        // Creating Object
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        System.out.println("Q1. " + colors);

        // 2. Write a Java program to iterate through all elements in a array list.
        Iterator<String> itr = colors.iterator();
        System.out.print("Q2. ");
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }

        // 3. WAJP to insert an element into the array list at the first position.
        colors.add(0, "cyan");
        System.out.println("\nQ3. " + colors);

        // 4. WAP to retrieve an element (at a specified index) from a given array list.
        System.out.println("Q4. " + colors.indexOf("red"));

        // 5. Write a Java program to remove the third element from a array list.
        System.out.print("Q5. " + colors.remove(2) + " --> ");
        System.out.println(colors);

        // 6. Write a Java program to search an element in a array list.
        Scanner sc = new Scanner(System.in);
        System.out.print("Q6. Search Any Color: ");
        String search = sc.next();
        if (colors.contains(search)) {
            System.out.println("\t~" + search + " Color Found In ArrayList At Index " + colors.indexOf(search));
        } else {
            System.out.println("\t ~Sorry...! " + search + " Color Not Found InnsArrayList");
        }

        // 7.Write a Java program to copy one array list into another.
        ArrayList<String> newcolors = new ArrayList<>();
        newcolors.addAll(colors);
        System.out.println("Q7." + newcolors);

        // 8. Write a Java program to compare two array lists.
        if (colors.equals(newcolors)) {
            System.out.println("Q8. Two ArrayLists Are Equal");
        } else {
            System.out.println("Q8. Two ArrayLists Are Not Equal");
        }
    }
}

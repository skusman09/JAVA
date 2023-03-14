package Collection_FrameWork.ArrayList;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Brown");
        colors1.add("Voilet");
        colors1.add("Pink");

        // Object Creation
        ArrayList<String> colors2 = new ArrayList<>();

        // Adding Colors
        // 01. Method "add"
        colors2.add("Black");
        colors2.add("Red");
        colors2.add("Blue");
        colors2.add("Green");
        colors2.add("Yellow");
        System.out.println("01. Method add(): " + colors2); // Traverse ArayList

        // 02. Method "addAll"
        // Add The Element In ArrayList
        colors2.addAll(colors1);

        System.out.println("02. Method addAll(): " + colors2);

        // 03. Method "add With Index"
        // Add The Element In ArrayList With Index 0,1,2,3,4,5....n
        colors2.add(1, "Cyan");
        System.out.println("03. Method add() With Index: " + colors2);

        // 04. Method ".get"
        // To Get Specific Element
        System.out.println("04. Method get(): " + colors2.get(5));

        // 05. Method "Remove()"
        // To Remove Element
        colors2.remove(0);
        System.out.println("05. Method remove(): " + colors2);

        // 06. Method "isEmpty"
        // ~If ArrayList Empty It is Return False Otherwise True
        System.out.println("06. Method isEmpty(): " + colors2.isEmpty());

        // 07. Method "Contains"
        // ~If ArrayList Contains Any Element Which Present In ArrayList Return True
        // else False
        System.out.println("07. Method contains(): " + colors2.contains("Blue"));

        // 08. Method "containsAll"
        // If colors1 Contains all the value of colors2 its true else false
        System.out.println("08. Method containsAll: " + colors2.containsAll(colors1));

        // 09. Method "Equals"
        // if colors1 equal to colors2 its ture else false
        System.out.println("09. Method equals(): " + colors2.equals(colors1));

        // 10. Method "Indexof"
        // Print the IndexOf Element
        System.out.println("10. Method indexof(): " + colors2.indexOf("Green"));

        // 11. Method "clear"
        // Clear all the element of arraylist(colors1/colors2)
        // colors2.clear();
        // System.out.println("11. Method clear(): " + colors2);

    }
}
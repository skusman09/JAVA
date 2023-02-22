import java.util.*;

class MenuCard {
  static Scanner sc = new Scanner(System.in);

  static void starters() {
    // Decraring And Initialising
    // Main Menu 00. Array
    String Menu[] = {
        "1. Starters",
        "2. Main Courses",
        "3. Salads",
        "4. MilkShakes",
        "5. Desserts"
    };

    // Menu 01.
    String Starter_Menu[] = {
        "1. Shawarma Roll  \tRs.100/-",
        "2. Nacho Chips    \tRs.80/-",
        "3. Veg Manchurian \tRs.120/-",
        "4. Spring Rolls   \tRs.130/-",
        "5. Steamed Wontons \tRs.110/-",
    };

    // Menu 02.
    String Main_Course_Menu[] = {
        "1. Butter Chicken    \tRs.200/-",
        "2. Mutton curry      \tRs.350/-",
        "3. Palak Paneer      \tRs.250/-",
        "4. Hydrabadi Biryani \tRs.400/-",
        "5. Dal Tadka          \tRs.150/-",
    };

    // Menu 03.
    String Salads_Menu[] = {
        "1. Green Salad   \tRs.80/-",
        "2. Caesar Salad  \tRs.150/-",
        "3. Pasta Salad   \tRs.160/-",
        "4. Chef Salad    \tRs.110/-",
        "5. Waldorf Salad \tRs.120/-"
    };

    // Menu 04.
    String MilkShakes_Menu[] = {
        "1. Chocolate Milkshake     \tRs.120/-",
        "2. Strawberry Milkshake    \tRs.140/-",
        "3. Blueberry Milkshake     \tRs.135/-",
        "4. Oreo Milkshake          \tRs.100/-",
        "5. Chai Tea Latte Milkshake \tRs.160/-"
    };

    // Menu 05.
    String Desserts_Menu[] = {
        "1. Mix Fruits    \tRs.140/-",
        "2. Custards      \tRs.130/-",
        "3. IceCream      \tRs.100/-",
        "4. Smoothies      \tRs.160/-",
        "5. Fried Desserts \tRs.110/-",
    };

    // Printing Menu
    for (int i = 0; i < Menu.length; i++) {
      System.out.println(Menu[i]);
    }

    // Taking Input From User
    System.out.println("--Enter Menu Option--");
    int option = sc.nextInt();

    // Printing Menu Of Menu
    switch (option) {
      case 1: // Option 01
        System.out.println(Menu[option - 1]);
        System.out.println("---------------------------------");
        System.out.println("\t ~Starter Menu~ ");
        for (int i = 0; i < Starter_Menu.length; i++) {
          System.out.println(Starter_Menu[i]);
        }
        System.out.println("---------------------------------");

        // Taking Quantity From User And Print Bill
        System.out.println("--Order From The Above--");
        int ch1 = sc.nextInt();
        System.out.println("Quantity:-");
        int q1 = sc.nextInt();
        switch (ch1) {
          case 1:
            System.out.println("==========Your Bill==========");
            System.out.println(q1 + " Shawarma Roll " + "\n\t Total: Rs." + (q1 * 100) + "/-");
            System.out.println("=============================");
            break;

          case 2:
            System.out.println("==========Your Bill===========");
            System.out.println(q1 + " Nacho Chips " + "\n\t Total: Rs." + (q1 * 80) + "/-");
            System.out.println("===============================");
            break;

          case 3:
            System.out.println("==========Your Bill===========");
            System.out.println(q1 + " Veg Manchurian " + "\n\t Total: Rs." + (q1 * 120) + "/-");
            System.out.println("===============================");
            break;

          case 4:
            System.out.println("==========Your Bill===========");
            System.out.println(q1 + " Spring Rolls " + "\n\t Total: Rs." + (q1 * 130) + "/-");
            System.out.println("===============================");
            break;

          case 5:
            System.out.println("==========Your Bill===========");
            System.out.println(q1 + " Steamed Wontons " + "\n\t Total: Rs." + (q1 * 110) + "/-");
            System.out.println("===============================");
            break;

          default:
            System.out.println(" ***Invalid Choice*** ");
            break;
        }
        break;

      case 2: // Option 02
        System.out.println(Menu[option - 1]);
        System.out.println("---------------------------------");
        System.out.println("\t ~Main Course Menu~ ");
        for (int i = 0; i < Main_Course_Menu.length; i++) {
          System.out.println(Main_Course_Menu[i]);
        }
        System.out.println("---------------------------------");

        // Take Quantity From User And Print Bill
        System.out.println("--Order From The Above--");
        int ch2 = sc.nextInt();
        System.out.println("Quantity:-");
        int q2 = sc.nextInt();
        switch (ch2) {
          case 1:
            System.out.println("==========Your Bill===========");
            System.out.println(q2 + " Butter Chicken " + "\n\t Total: Rs." + (q2 * 200) + "/-");
            System.out.println("===============================");
            break;

          case 2:
            System.out.println("==========Your Bill===========");
            System.out.println(q2 + " Mutton curry " + "\n\t Total: Rs." + (q2 * 350) + "/-");
            System.out.println("===============================");
            break;

          case 3:
            System.out.println("==========Your Bill===========");
            System.out.println(q2 + " Palak Paneer " + "\n\t Total: Rs." + (q2 * 250) + "/-");
            System.out.println("===============================");
            break;

          case 4:
            System.out.println("==========Your Bill===========");
            System.out.println(q2 + " Hydrabadi Biryani " + "\n\t Total: Rs." + (q2 * 400) + "/-");
            System.out.println("===============================");
            break;

          case 5:
            System.out.println("==========Your Bill===========");
            System.out.println(q2 + " Dal Tadka " + "\n\t Total: Rs." + (q2 * 150) + "/-");
            System.out.println("===============================");
            break;

          default:
            System.out.println(" ***Invalid Choice*** ");
            break;
        }
        break;

      case 3: // Option 03
        System.out.println(Menu[option - 1]);
        System.out.println("-------------------------------");
        System.out.println("\t ~Salads Menu~ ");
        for (int i = 0; i < Salads_Menu.length; i++) {
          System.out.println(Salads_Menu[i]);
        }
        System.out.println("-------------------------------");

        // Taking Quantity From User And Print Bill
        System.out.println("--Order From The Above--");
        int ch3 = sc.nextInt();
        System.out.println("Quantity:-");
        int q3 = sc.nextInt();
        switch (ch3) {
          case 1:
            System.out.println("==========Your Bill==========");
            System.out.println(q3 + " Green Salad " + "\n\t Total: Rs." + (q3 * 80) + "/-");
            System.out.println("=============================");
            break;

          case 2:
            System.out.println("==========Your Bill===========");
            System.out.println(q3 + " Caesar Salad " + "\n\t Total: Rs." + (q3 * 150) + "/-");
            System.out.println("===============================");
            break;

          case 3:
            System.out.println("==========Your Bill===========");
            System.out.println(q3 + " Pasta Salad " + "\n\t Total: Rs." + (q3 * 160) + "/-");
            System.out.println("===============================");
            break;

          case 4:
            System.out.println("==========Your Bill===========");
            System.out.println(q3 + " Chef Salad " + "\n\t Total: Rs." + (q3 * 110) + "/-");
            System.out.println("===============================");
            break;

          case 5:
            System.out.println("==========Your Bill===========");
            System.out.println(q3 + " Waldorf Salad " + "\n\t Total: Rs." + (q3 * 120) + "/-");
            System.out.println("===============================");
            break;

          default:
            System.out.println(" ***Invalid Choice*** ");
            break;
        }
        break;

      case 4: // Option 04
        System.out.println(Menu[option - 1]);
        System.out.println("---------------------------------------");
        System.out.println("\t ~MilkShakes Menu~ ");
        for (int i = 0; i < MilkShakes_Menu.length; i++) {
          System.out.println(MilkShakes_Menu[i]);
        }
        System.out.println("---------------------------------------");

        // Taking Quantity From User And Print Bill
        System.out.println("--Order From The Above--");
        int ch4 = sc.nextInt();
        System.out.println("Quantity:-");
        int q4 = sc.nextInt();
        switch (ch4) {
          case 1:
            System.out.println("==========Your Bill==========");
            System.out.println(q4 + " Chocolate Milkshake " + "\n\t Total: Rs." + (q4 * 120) + "/-");
            System.out.println("=============================");
            break;

          case 2:
            System.out.println("==========Your Bill===========");
            System.out.println(q4 + " Strawberry Milkshake " + "\n\t Total: Rs." + (q4 * 140) + "/-");
            System.out.println("===============================");
            break;

          case 3:
            System.out.println("==========Your Bill===========");
            System.out.println(q4 + " Blueberry Milkshake " + "\n\t Total: Rs." + (q4 * 135) + "/-");
            System.out.println("===============================");
            break;

          case 4:
            System.out.println("==========Your Bill===========");
            System.out.println(q4 + " Oreo Milkshake " + "\n\t Total: Rs." + (q4 * 100) + "/-");
            System.out.println("===============================");
            break;

          case 5:
            System.out.println("==========Your Bill===========");
            System.out.println(q4 + " Chai Tea Latte Milkshake " + "\n\t Total: Rs." + (q4 * 160) + "/-");
            System.out.println("===============================");
            break;

          default:
            System.out.println(" ***Invalid Choice*** ");
            break;
        }
        break;

      case 5: // Option 05
        System.out.println(Menu[option - 1]);
        System.out.println("-------------------------------");
        System.out.println("\t ~Desserts Menu~ ");
        for (int i = 0; i < Desserts_Menu.length; i++) {
          System.out.println(Desserts_Menu[i]);
        }
        System.out.println("-------------------------------");

        // Taking Quantity From User And Print Bill
        System.out.println("--Order From The Above--");
        int ch5 = sc.nextInt();
        System.out.println("Quantity:-");
        int q5 = sc.nextInt();
        switch (ch5) {
          case 1:
            System.out.println("==========Your Bill==========");
            System.out.println(q5 + " Mix Fruits " + "\n\t Total: Rs." + (q5 * 140) + "/-");
            System.out.println("=============================");
            break;

          case 2:
            System.out.println("==========Your Bill===========");
            System.out.println(q5 + " Custards " + "\n\t Total: Rs." + (q5 * 130) + "/-");
            System.out.println("===============================");
            break;

          case 3:
            System.out.println("==========Your Bill===========");
            System.out.println(q5 + " IceCream" + "\n\t Total: Rs." + (q5 * 100) + "/-");
            System.out.println("===============================");
            break;

          case 4:
            System.out.println("==========Your Bill===========");
            System.out.println(q5 + " Smoothies " + "\n\t Total: Rs." + (q5 * 160) + "/-");
            System.out.println("===============================");
            break;

          case 5:
            System.out.println("==========Your Bill===========");
            System.out.println(q5 + " Fried Desserts " + "\n\t Total: Rs." + (q5 * 110) + "/-");
            System.out.println("===============================");
            break;

          default:
            System.out.println(" ***Invalid Choice*** ");
            break;
        }
        break;

      default:
        System.out.println(" ***Invalid Choice*** ");
        break;
    }
  }

  static void repeat() {
    while (true) {
      System.out.println("\n\nOrder Anything Else: (y/n)");
      char wish = sc.next().charAt(0);
      if (wish == 'y' || wish == 'Y') {
        starters();

      } else if (wish == 'n' || wish == 'N') {
        break;

      } else {
        System.out.println(" ***Invalid Input*** ");
        System.out.println("\nOrder Anything Else: (y/n)");
        wish = sc.next().charAt(0);
      }
    }
  }

  public static void main(String[] args) {
    starters();
    repeat();
  }
}
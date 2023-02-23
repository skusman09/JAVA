/* Scenario:> 16-02-2023
 A library needs to develop an online application for two types of users/roles, Adults and children.
 Both of these users should be able to register an account.
 Any user who is less than 12 years of age will be registered as a child
 and they can borrow a “Kids” category book for 10 days,
 whereas an adult can borrow “Fiction” category books which need to be returned within 7 days.
Note: In future, more users/roles might be added to the library where similar rules will be enforced.
Develop Interfaces and classes for the categories mentioned above.
*/

// Problem Statement 1:
interface LibraryUser {

    public void registerAccount();

    public void requestBook();
}

// 2. Creating two classes "KidUsers" and "AdultUser" which implements the
// LibraryUser interface.

// 2-a. KidUsers Class
class KidUsers implements LibraryUser {
    // 3. Instance Variables
    int age;
    String bookType;

    // Using Getter And Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    // 4-a KidUser's method registerAccount() perform some logic
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        }

        if (age > 12) {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    // 4-b KidUser's method requestBook() perform some logic
    public void requestBook() {
        if (bookType == "Kids") {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

// 2-b. AdultUser Class
class AdultUser implements LibraryUser {
    // 3. Instance Variables
    int age;
    String bookType;

    // Using Getter And Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    // 5-a AdultUser's method registerAccount() perform some logic
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        }

        if (age < 12) {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    // 5-b AdultUser's method requestBook() perform some logic
    public void requestBook() {
        if (bookType == "Fiction") {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

// 6. Main Class
public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        // Test case #1:
        KidUsers kid = new KidUsers(); // Creating Objects
        kid.setAge(10); // Invoke Kids Age
        kid.registerAccount(); // Invoking KidUsers's method "registerAccount()"
        kid.setAge(18); // Invoke Kids Age
        kid.registerAccount(); // Invoking KidUsers's method "registerAccount()"
        System.out.println("\n");
        kid.setBookType("Kids"); // Invoke Kids BookType
        kid.requestBook(); // Invoking KidUsers's method "requestBook()"
        kid.setBookType("Fiction"); // Invoke Kids BookType
        kid.requestBook(); // Invoking KidUsers's method "requestBook()"
        System.out.println("\n");

        // Test case #2:
        AdultUser adult = new AdultUser(); // Creating Objects
        adult.setAge(5); // Invoke Adult Age
        adult.registerAccount(); // Invoking AdultUser's method "registerAccount()"
        adult.setAge(23); // Invoke Adult Age
        adult.registerAccount(); // Invoking AdultUser's method "registerAccount()"
        System.out.println("\n");
        adult.setBookType("Kids"); // Invoke Adult BookType
        adult.requestBook(); // Invoking AdultUser's method "requestBook()"
        adult.setBookType("Fiction"); // Invoke Adult BookType
        adult.requestBook(); // Invoking AdultUser's method "requestBook()"

    }
}

/*
  PROJECT BY MOHAMMED USMAN SHAIKH
  Credit Goes To Anudip Foundation
  ❤️❤️❤️
 */
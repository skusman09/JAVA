/* 2- Inheritance
 c) Hierarchical Inheritance    
base class        a
    ||
drived class   b -> a
    ||         
drived class   c  -> a // Tow Sub(Child) Class Have Same Base(Parent) Class
*/

class Engineering {
    int year = 4;
    String university = "Mumbai University";
    String location = "Mumbai, Maharashtra";
    int seats;
}

class ComputerScience extends Engineering {
    String name;
    int id;
    String college;
    int fees;

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("college: " + this.college);
        System.out.println("fees: " + this.fees);

        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("Seats Available : " + (this.seats = 70));// Invoking From Parent Class

    }
}

class Electrincal extends Engineering {
    String name;
    int id;
    String college;
    int fees;

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("college: " + this.college);
        System.out.println("fees: " + this.fees);
        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("Seats Available : " + (this.seats = 75));// Invoking From Parent Class
    }

}

class Mechanical extends Engineering {
    String name;
    int id;
    String college;
    int fees;

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("college: " + this.college);
        System.out.println("fees: " + this.fees);

        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("Seats Available : " + (this.seats = 65));// Invoking From Parent Class
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        ComputerScience computer = new ComputerScience();
        computer.name = "Usman";
        computer.id = 1626415;
        computer.college = "M.H. Saboo Siddik College of Engineering";
        computer.fees = 120000;
        computer.info();
        System.out.println("\n");

        Electrincal electrincal = new Electrincal();
        electrincal.name = "Umar";
        electrincal.id = 3646843;
        electrincal.college = "K. J. Somaiya Institute of Engineering and Information Technology";
        electrincal.fees = 200000;
        electrincal.info();
        System.out.println("\n");

        Mechanical mechanical = new Mechanical();
        mechanical.name = "Maviya";
        mechanical.id = 1626415;
        mechanical.college = "The Xavier Institute of Engineering";
        mechanical.fees = 134000;
        mechanical.info();
        System.out.println("\n");
    }
}
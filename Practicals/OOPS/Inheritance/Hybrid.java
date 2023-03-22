// Hybrid Is a Mixture Of Single Inheritance, Multilevel Inheritance, And Hierarachical Inheritance

// -------------01- Single Level-------------\\

package Inheritance;

class Room { // Base Class or Parent Class
    String color;
    String rooms;
    int deposit;
    int rent;

    public void homeInfo() {
        System.out.println("Single Level Inheritance");
        System.out.println("Owner Name: Usman");
    }
}

class Tenant1 extends Room { // Sub Class Or Child Class
    String name;
    int maintenance;
    String parking;

    public void firstTenant() {
        System.out.println("-----|The First Tenant|-----");
        System.out.println("First Tenant Name: " + this.name);
        System.out.println("Interior color: " + this.color);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Maintenance: " + this.maintenance);
        System.out.println("Deposit: " + this.deposit);
        System.out.println("Rent: " + this.rent);
        System.out.println("Parking: " + this.parking);
    }
}

// -----------------02- Multilevel-----------------\\
class Grndpa { // class 1
    String name;
    String marriageDate;
    String hairColor;
    String eyeColor;
    double height;
    int age;
    int kids;

    public void grandpa() {
        System.out.println("Im GrandFather");
        System.out.println("MarriageDate: " + this.marriageDate);
        System.out.println("HairColor: " + this.hairColor);
        System.out.println("EyeColor: " + this.eyeColor);
        System.out.println("Height: " + this.height);
        System.out.println("Ege: " + this.age);
        System.out.println("Kids: " + this.kids);
    }
}

class Fathr extends Grndpa { // class 2 extends class 1
    public void father() {
        System.out.println("\nIm Father");
        System.out.println("MarriageDate: " + this.marriageDate);
        System.out.println("HairColor: " + this.hairColor);
        System.out.println("EyeColor: " + this.eyeColor);
        System.out.println("Height: " + this.height);
        System.out.println("Ege: " + this.age);
        System.out.println("Kids: " + this.kids);
    }

}

class Sons extends Fathr { // class 3 extends class 1
    public void son() {
        System.out.println("\nIm Son");
        System.out.println("Age: " + this.age);
        System.out.println("Hair Color: " + this.hairColor);
        System.out.println("Eye Color: " + this.eyeColor);
        System.out.println("Height: " + this.height);
    }

}

// -------------------03- Hierarchical------------------\\
class Engineerings {
    int year = 4;
    String university = "Mumbai University";
    String location = "Mumbai, Maharashtra";
    int seats;
}

class IT extends Engineerings {
    String name;
    int id;
    String college;
    int fees;

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("college: " + this.college);
        System.out.println("Seats Available : " + (this.seats = 60));// Invoking From Parent Class
        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("fees: " + this.fees);
    }
}

class Electrincals extends Engineerings {
    String name;
    int id;
    String college;
    int fees;

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("college: " + this.college);
        System.out.println("Seats Available : " + (this.seats = 70));// Invoking From Parent Class
        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("fees: " + this.fees);

    }
}

class Mechanicals extends Engineerings {
    String name;
    int id;
    String college;
    int fees;

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("college: " + this.college);
        System.out.println("Seats Available : " + (this.seats = 80));// Invoking From Parent Class
        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("fees: " + this.fees);

    }
}

// -----------------------------MAIN CLASS-----------------------------\\
public class Hybrid {
    public static void main(String[] args) {

        // -------------01- Single Level-------------\\
        System.out.println("Single Level Inheritance");
        Tenant1 ft = new Tenant1();
        ft.name = "Umar";
        ft.color = "Light-Yellow";
        ft.rooms = "2BHK";
        ft.deposit = 300000;
        ft.rent = 40000;
        ft.parking = "2 Wheeler Only";
        ft.maintenance = 5000;
        ft.homeInfo();
        ft.firstTenant();

        // -----------------02- Multilevel-----------------\\
        System.out.println("\nMultilevel Inheritance");

        Grndpa grandpa = new Grndpa();
        grandpa.marriageDate = "10-02-1940";
        grandpa.hairColor = "white";
        grandpa.eyeColor = "Brown";
        grandpa.age = 70;
        grandpa.height = 6.1;
        grandpa.kids = 3;
        grandpa.grandpa();

        Fathr father = new Fathr();
        father.marriageDate = "28-06-1980";
        father.age = 40;
        father.eyeColor = "blue";
        father.kids = grandpa.kids;
        father.height = 5.9;
        father.hairColor = "Black";
        father.father();

        Sons son = new Sons();
        son.age = 15;
        son.eyeColor = grandpa.eyeColor;
        son.height = father.height;
        son.hairColor = father.hairColor;
        son.son();

        // -------------------03- Hybrid------------------\\
        System.out.println("\nHybrid Inheritance");
        IT BE_IT = new IT();
        BE_IT.name = "Usman";
        BE_IT.id = 1626415;
        BE_IT.college = "M.H. Saboo Siddik College of Engineering";
        BE_IT.fees = 120000;
        BE_IT.info();
        System.out.println("\n");

        Electrincals electrincal = new Electrincals();
        electrincal.name = "Umar";
        electrincal.id = 3646843;
        electrincal.college = "K. J. Somaiya Institute of Engineering and Information Technology";
        electrincal.fees = 200000;
        electrincal.info();
        System.out.println("\n");

        Mechanicals mechanical = new Mechanicals();
        mechanical.name = "Maviya";
        mechanical.id = 1626415;
        mechanical.college = "The Xavier Institute of Engineering";
        mechanical.fees = 134000;
        mechanical.info();
        System.out.println("\n");
    }
}

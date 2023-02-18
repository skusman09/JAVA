// Hybrid Is a Mixture Of Single Inheritance, Multilevel Inheritance, And Hierarachical Inheritance

// -------------Single Level-------------\\
class Home { // Base Class or Parent Class
    String color;
    String rooms;
    int deposit;
    int rent;

    public void homeInfo() {
        System.out.println("Single Level Inheritance");
        System.out.println("Owner Name: Usman");
    }
}

class FirstTenant extends Home { // Sub Class Or Child Class
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

// -----------------Multilevel-----------------\\
class Grandpa { // class 1
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

class Father extends Grandpa { // class 2 extends class 1
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

class Son extends Father { // class 3 extends class 1
    public void son() {
        System.out.println("\nIm Son");
        System.out.println("Age: " + this.age);
        System.out.println("Hair Color: " + this.hairColor);
        System.out.println("Eye Color: " + this.eyeColor);
        System.out.println("Height: " + this.height);
    }

}

// -------------------Hierarchical------------------\\
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
        System.out.println("Seats Available : " + this.seats);// Invoking From Parent Class
        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("fees: " + this.fees);
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
        System.out.println("Seats Available : " + this.seats);// Invoking From Parent Class
        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("fees: " + this.fees);

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
        System.out.println("Seats Available : " + this.seats);// Invoking From Parent Class
        System.out.println("Year Of Engineering: " + this.year); // Invoking From Parent Class
        System.out.println("University Name: " + this.university);// Invoking From Parent Class
        System.out.println("University Location: " + this.location);// Invoking From Parent Class
        System.out.println("fees: " + this.fees);

    }
}

// -----------------------------MAIN CLASS-----------------------------\\
public class Hybrid {
    public static void main(String[] args) {

        // -------------Single Level-------------\\
        System.out.println("Single Level Inheritance");
        FirstTenant ft = new FirstTenant();
        ft.name = "Umar";
        ft.color = "Light-Yellow";
        ft.rooms = "2BHK";
        ft.deposit = 300000;
        ft.rent = 40000;
        ft.parking = "2 Wheeler Only";
        ft.maintenance = 5000;
        ft.homeInfo();
        ft.firstTenant();

        // -----------------Multilevel-----------------\\
        System.out.println("\nMultilevel Inheritance");
        Grandpa grandpa = new Grandpa();
        grandpa.marriageDate = "10-02-1940";
        grandpa.hairColor = "white";
        grandpa.eyeColor = "Brown";
        grandpa.age = 70;
        grandpa.height = 6.1;
        grandpa.kids = 3;
        grandpa.grandpa();

        Father father = new Father();
        father.marriageDate = "28-06-1980";
        father.age = 40;
        father.eyeColor = "blue";
        father.kids = grandpa.kids;
        father.height = 5.9;
        father.hairColor = "Black";
        father.father();

        Son son = new Son();
        son.age = 15;
        son.eyeColor = grandpa.eyeColor;
        son.height = father.height;
        son.hairColor = father.hairColor;
        son.son();

        // -------------------Hybrid------------------\\
        System.out.println("\nHybrid Inheritance");
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

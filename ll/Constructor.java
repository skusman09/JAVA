/*There Are 3 types of construction
 1- NON-Parameterized Constructor.
 2- Parameterized Constructor.
 3- Copy Constructor
 */

class Car {
    String brand;
    int speed;
    int cost;

    public void carInfo() {
        System.out.println(this.brand);
        System.out.println(this.speed);
        System.out.println(this.cost);
    }

    // 1- NON-Parameterized Constructor.
    Car() { // NON Parameterized constructor // We can also creat constructor like this
        System.out.println("Car is Running");
    }
}

// -------------------------------------\\
class Employee {
    String name;
    int ID;
    int salary;

    public void employeeInfo() {
        System.out.println(this.name);
        System.out.println(this.ID);
        System.out.println(this.salary);
    }

    // 2- Parameterized Constructor.
    Employee(String name, int ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }
}

// ------------------------------------------------\\
class Bike {
    String brand;
    int speed;
    int cost;

    public void bikeInfo() {
        System.out.println(this.brand);
        System.out.println(this.speed);
        System.out.println(this.cost);
    }

    Bike() {
    }

    // Copy Constructor
    Bike(Bike b2) {
        this.brand = b2.brand;
        this.speed = b2.speed;
        this.cost = b2.cost;
    }

}

public class Constructor {
    public static void main(String[] args) {
        // Car Class
        System.out.println("Non-Parameterized Constructor");
        Car c1 = new Car(); // here it is "Car()" is a constructor
        c1.brand = "BMW";
        c1.speed = 400;
        c1.cost = 20000000;
        c1.carInfo();

        // Employee Class // Parameterized Constructor
        Employee e1 = new Employee("\n\nParameterized Constructor \nusman", 101, 20000);
        e1.employeeInfo();

        // class Bike Copy Constructor
        System.out.println("\n\nCopy Constructor");
        Bike b1 = new Bike();
        b1.brand = "\nYAMAHA";
        b1.speed = 600;
        b1.cost = 6000000;
        b1.bikeInfo();

        Bike b2 = new Bike(b1);
        b2.bikeInfo();

        Bike b3 = new Bike(b2);
        b3.bikeInfo();

        Bike b4 = new Bike(b3);
        b4.bikeInfo();

        Bike b5 = new Bike(b4);
        b5.bikeInfo();
    }
}

/*
 Scenario: In a company there are employees with two designations Manager and Trainee.
 Both employees share the same set of attributes and basic salary calculation logic is same
 but the basic salary of trainee and manager are different.
 The Manager has a travel allowance equal to 15% of the basic salary,
 whereas all the other employees the travel allowance is 10% of the basic salary.
 Write a program to maintain the entities using inheritance.
 */

//  Problem Statement 1:
// 1. This Is Employee Class, Base Class Or Parent Class.
class Employee {
    // These Are Instance Variables As Given.
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra = 1000.50;

    // 2. Overloaded Parameterized Constructor Of Employee Class.
    Employee(long id, String Name, String address, long phone) {

        // "This" Keyword Pass an argument in the constructor call.
        this.employeeId = id;
        this.employeeName = Name;
        this.employeeAddress = address;
        this.employeePhone = phone;
    }

    // 3. This Is Method Of calculateSalary.
    public void calculateSalary() {
        double salary; // Local Variable.
        // Formula For Salary As Below.
        salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
        System.out.println("Salary: " + salary); // Printing Salary.
    }

    // Problem Statement 2:
    // 1. Method For Calculating Default Transport Allowance.
    public void calculateTransportAllowance() {
        double TransportAllowance; // Local Variable.
        TransportAllowance = 10 * basicSalary / 100; // Formula For Default Transport Allowance.
        // Printing Default Transport Allowance.
        System.out.println("Default Transport Allowance: " + TransportAllowance);
    }

}

// 4. Creating the sub classes Manager and Trainee with base class Employee.

// Sub Class Or Child Class Of Employee Class.
class Manager extends Employee {
    // Overloaded Parameterized Constructors Of Manager Class.
    Manager(long id, String Name, String address, long phone, double salary) {
        super(id, Name, address, phone); // Super Keyword Refers To Access The Superclass(Parent) Constructor.
        // "This" Keyword Pass an argument in the constructor call.
        this.employeeId = id;
        this.employeeName = Name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    // Problem Statement 2:
    // 2. Method For Calculating Manager Transport Allowance.
    public void calculateTransportAllowance() {
        double TransportAllowance; // Local Variable.
        TransportAllowance = 15 * basicSalary / 100; // Formula For Manager Transport Allowance.
        // Printing Manager Transport Allowance.
        System.out.println("Transport Allowance For Manager: " + TransportAllowance);
    }
}

// Sub Class Or Child Class Of Employee Class.
class Trainee extends Employee {
    // Overloaded Parameterized Constructors Of Trainee Class.
    Trainee(long id, String Name, String address, long phone, double salary) {
        super(id, Name, address, phone); // Super Keyword Refers To Access The Superclass(Parent) Constructor.
        // "This" Keyword Pass an argument in the constructor call.
        this.employeeId = id;
        this.employeeName = Name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    // Problem Statement 2:
    // 3. Method For Calculating Trainee Transport Allowance.
    public void calculateTransportAllowance() {
        super.calculateTransportAllowance(); // Super Keyword used to call superclass(Parent) methods.
    }
}
/*
 * Here, We Creat Two Sub Classes With Same Parent So...,
 * This is Called "Hierarchical Inheritance".
 */

// 5. Main Class
class InheritanceActivity {
    public static void main(String[] args) {
        // Test case #1:
        // Creating An Object Of Manager Class By Calling The Overloaded Constructor.
        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        // Printing The Manager Details.
        System.out.println("\n~Manager Details~");
        System.out.println("ID: " + manager.employeeId);
        System.out.println("Name: " + manager.employeeName);
        System.out.println("Address: " + manager.employeeAddress);
        System.out.println("Phone: " + manager.employeePhone);
        System.out.println("Basic Salary: " + manager.basicSalary);
        manager.calculateSalary(); // Invoking The calculateSalary Method Of The Manager Object.
        manager.calculateTransportAllowance(); // Invoking The calculateTransportAllowance From The Manager Class.

        // Test case #2:
        // Creating An Object Of Manager Class By Calling The Overloaded Constructor.
        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        // Printing The Trainee Details.
        System.out.println("\n\n~Trainee Details~");
        System.out.println("ID: " + trainee.employeeId);
        System.out.println("Name: " + trainee.employeeName);
        System.out.println("Address: " + trainee.employeeAddress);
        System.out.println("Phone: " + trainee.employeePhone);
        System.out.println("Basic Salary: " + trainee.basicSalary);
        trainee.calculateSalary(); // Invoking The calculateSalary Method Of The Trainee Object.
        trainee.calculateTransportAllowance(); // Invoking The calculateTransportAllowance Form The Trainee Class.
    }
}
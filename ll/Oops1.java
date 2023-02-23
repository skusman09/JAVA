/*There Are 4(Four) Pillers of OOPS


1- Polymorphism
a) Method OverLoading   (Compile Time Polymorphism) // This method is best
b) Method Overriding    (Run Time Polymorphism) // Avoid this method

2- Inheritance
a) Single Level Inheritance
b) Multi Level Inheritance
c) Hierarchical Inheritance
d) Hybrid Inheritance
e) Using Interface Instead Of Multiple Inheritance


3- Encapsulation


4- Abstracation

 */

class Pen { // pen class (Blue Print Of Pen)
    String color;
    String type;
    int cost;

    public void penInfo() {
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.cost);
        System.out.println("Writing Something");
    }
}

class Student { // Student class (Blue Print Of Students)
    String name;
    int age;
    int ID;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.ID);
        System.out.println("BScIT Student");
    }
}

public class Oops1 {
    public static void main(String args[]) {
        // Creating PenClass objects(products)
        Pen p1 = new Pen(); // here it is {Pen()<== this is constructor of object| also called non
                            // parameterize constructor}
        p1.color = "Blue";
        p1.type = "Ball Point";
        p1.cost = 10;
        p1.penInfo();

        // Creating StudentClass objects(products)
        Student s1 = new Student(); // here it is {Student()<== this is constructor of object| also called non
                                    // parameterize constructor}
        s1.name = "\nusman";
        s1.age = 22;
        s1.ID = 348;
        s1.printInfo();
    }
}
package _1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

// Q1. Make a User Define Class with data members username, age, address
class Student {
    String username;
    int age;
    String address;
    static int student_count = 1;

    public Student(String username, int age, String address) {
        this.username = username;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student " + (student_count++) + "[username=" + username + ", age=" + age + ", address=" + address + "]";
    }
}

public class ArrayList_HW {
    public static void main(String[] args) {
        Student std1 = new Student("Usman", 21, "Mira Road");
        Student std2 = new Student("Umar", 23, "Mahim");
        Student std3 = new Student("Maviya", 22, "Seawood");
        Student std4 = new Student("Osama", 22, "Mumbai Central");

        // 01 -> Create some objects and add inside arrayList
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);
        studentList.add(std4);

        // 02 -> Traverse all Objects with the help of Iterator Inteface
        Iterator<Student> itr = studentList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 03 -> Remove position 2 Object from ArrayList
        System.out.println("\n03. Remove position 2 Object from ArrayList:\n" + studentList.remove(1));
        System.out.println("\nAfter Removing Position 2 Object: ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // 04 -> Perform a searching operation with username
        System.out.println("\n04. Searching operation with username");
        for (Student student : studentList) {
            if (student.username.equals("Usman")) {
                System.out.println(
                        "Username Found: " + "Username: " + student.username + ", Age: " + student.age + ", Address: "
                                + student.address);
            }
        }

        // 05 -> Add another List of Objects inside ArrayList
        System.out.println("\n05. Add another List of Objects inside ArrayList");
        ArrayList<Student> newStudents = new ArrayList<>();
        newStudents.add(new Student("Ali", 23, "Dubai"));
        newStudents.add(new Student("Maaz", 22, "Dharavi"));
        studentList.addAll(newStudents);
        itr = studentList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

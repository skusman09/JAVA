package _1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student {

	private int rollNumber;
	private String name;
	private String course;

	static private int student_count = 1;

	public int getrollNumber() {
		return rollNumber;
	}

	public void setrollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(int rollNumber, String name, String course) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student " + (student_count++) + " [rollNumber=" + rollNumber + ", name=" + name + ", course="
				+ course + "]";
	}

}

public class ArrayListExample {
	public static void main(String[] args) {

		// objects of student class (parametersed constructor)
		Student ram = new Student(1, "ram", "Advance Java");
		Student ajay = new Student(2, "Ajay", "AWS");
		Student raju = new Student(3, "Raju", "Excel");

		// objects of student class (Setter method)
		Student abhi = new Student();
		abhi.setrollNumber(4);
		abhi.setname("Abhi");
		abhi.setCourse("Basic Computer");

		// Creating ArrayList for Storing Student Class Objects
		ArrayList<Student> studentList = new ArrayList<>();

		// Adding Student in ArrayList(studentList)
		studentList.add(ram);
		studentList.add(ajay);
		studentList.add(raju);
		studentList.add(abhi);

		studentList.add(new Student(5, "rajan", "Digital Markeeting"));

		studentList.remove(1);

		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
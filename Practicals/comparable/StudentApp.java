package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentApp {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		Student s1 = new Student();
		s1.setRollNumber(1);
		s1.setName("abhi");
		s1.setCourse("Java");
		s1.setFee(15000);

		studentList.add(new Student(2, "rakesh", "AWS", 18000));

		Collections.addAll(studentList, new Student(3, "ajay", "Excel", 3000),
				new Student(10, "chandan", "cyber security", 20000));

		Student s2 = new Student(7, "sam", "web designing", 7000);
		Student s3 = new Student(8, "john", "C programming", 3000);
		Student s4 = new Student(3, "raj", "web developement", 7000);
		Student s5 = new Student(5, "cinna", "C++ programming", 3000);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		System.out.println(studentList);

		// using enhanced for loop
		for (Student val : studentList)
			System.out.println(val);

		// using forEach (lambda exp)
		studentList.forEach(val -> System.out.println(val));

		// using normal loop
		for (int i = 0; i < studentList.size(); i++)
			System.out.println(studentList.get(i));

		// using iterator
		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		Collections.sort(studentList, Comparator.reverseOrder());
		//
		// Iterator<Student> itrnew = studentList.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("abc".compareTo("abc"));

	}

}

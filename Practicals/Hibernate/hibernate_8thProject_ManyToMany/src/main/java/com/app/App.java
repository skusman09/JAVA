package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateConnection;
import model.Course;
import model.Student;

public class App {
	public static void main(String[] args) {
		Session session = HibernateConnection.getSession();
		Transaction tr = session.beginTransaction();

		Student s1 = new Student();
		s1.setStd_Name("Usman");
		Student s2 = new Student();
		s2.setStd_Name("Muaviyah");
		Student s3 = new Student();
		s3.setStd_Name("Yahyah");
		List<Student> studentList = new LinkedList<Student>();
		Collections.addAll(studentList, s1, s2, s3);

		Course c1 = new Course();
		c1.setC_Id(1010);
		c1.setC_Name("JAVA");
		Course c2 = new Course();
		c2.setC_Id(1011);
		c2.setC_Name("JavaScript");
		Course c3 = new Course();
		c3.setC_Id(1012);
		c3.setC_Name("Python");

		List<Course> courseList = new ArrayList<Course>();
		Collections.addAll(courseList, c1, c2, c3);

		s1.setCourses(courseList);
		s2.setCourses(courseList);
		s3.setCourses(courseList);

		c1.setStudents(studentList);
		c2.setStudents(studentList);
		c3.setStudents(studentList);

		session.saveOrUpdate(s1);
		session.saveOrUpdate(s2);
		session.saveOrUpdate(s3);
//
		session.saveOrUpdate(c1);
		session.saveOrUpdate(c2);
		session.saveOrUpdate(c3);
		tr.commit();
	}
}

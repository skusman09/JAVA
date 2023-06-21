package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateConnection;
import model.Courses;
import model.Student;

public class App {
	public static void main(String[] args) {
		Session session = HibernateConnection.getSession();

		Courses c1 = new Courses("J1045", "JAVA", "6month", 7000);

		Student std1 = new Student(101, "Usman", "MIRA ROAD", "7738517898", c1);

		session.saveOrUpdate(c1);
		session.saveOrUpdate(std1);

		Transaction tr = session.beginTransaction();
		tr.commit();
	}
}

package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateConnection;
import model.College;
import model.Student;

public class App {
	public static void main(String[] args) {
		Session session = HibernateConnection.getSession();
		Transaction tr = session.beginTransaction();

		College col1 = new College("B290943", "MMK College", "Bandra");

		Student std1 = new Student(0, "Usman", col1);
		Student std2 = new Student(0, "Mujeeb", col1);
		Student std3 = new Student(0, "Shavez", col1);
		Student std4 = new Student(0, "Mushtaq", col1);

		session.saveOrUpdate(std1);
		session.saveOrUpdate(std2);
		session.saveOrUpdate(std3);
		session.saveOrUpdate(std4);

		tr.commit();
	}
}

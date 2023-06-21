package com.app;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory sf = conf.buildSessionFactory();

		Session session = sf.openSession();

//		Object object = session.get("com.app.Employee", 3);

		// Read Data
//		System.out.println(object);

		Transaction tr = session.beginTransaction(); // For DML

//		Insert Data
		Employee emp1 = new Employee(4, "MD_Ali");
		session.saveOrUpdate(emp1);

//		Delete Data
//		Employee emp2 = session.get(Employee.class, 4);
//		session.delete(emp2);
		
//		Employee emp2

		tr.commit();

	}
}

package com.app.Hibernate_2ndProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Customer;
import model.Student;

public class App {
	public static void main(String[] args) throws ParseException {

		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory sf = conf.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		String date = "15/04/2023";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(date);

		Customer c1 = new Customer("Arzan", "sjjs456", doj);
		session.saveOrUpdate(c1);
		Customer c2 = new Customer("Yahya", "14qwa56", doj);
		session.saveOrUpdate(c2);
		Customer c3 = new Customer("Muaviyah", "1wsd456", doj);
		session.saveOrUpdate(c3);
		Customer c4 = new Customer("Huzaifa", "sji787", doj);
		session.saveOrUpdate(c4);
		Customer c5 = new Customer("Sufiyan", "9w@wjsj9", doj);
		session.saveOrUpdate(c5);
		Customer c6 = new Customer("Wasi", "92*&2huh", doj);
		session.saveOrUpdate(c6);
		Customer c7 = new Customer("Ammar", "@1kdjid9@#", doj);
		session.saveOrUpdate(c7);

//		Customer c2 = session.get(Customer.class, 13);
//		session.delete(c2);

		Customer c8 = session.get(Customer.class, 4);
		System.out.println(c8);

		Student std1 = new Student(0, "Usman", "Mumbai", "773851785");
		session.saveOrUpdate(std1);
		Student std2 = new Student(0, "Muaviyah", "Thane", "808095478");
		session.saveOrUpdate(std2);
		Student std3 = new Student(0, "Umar", "Dharavi", "998747485");
		session.saveOrUpdate(std3);

		Student std4 = session.get(Student.class, 3);
		System.out.println(std4);
		tr.commit();
	}
}
package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateConnection;
import model.Company;
import model.Employee;

public class App {
	public static void main(String[] args) {
		Session session = HibernateConnection.getSession();
		Transaction tr = session.beginTransaction();

		Company comp1 = new Company("A204520", "HP", "Tech");
		
		Employee emp1 = new Employee(101, "Usman", new Date(), 400000, comp1);
		Employee emp2 = new Employee(102, "Muaviyah", new Date(), 400000, comp1);
		Employee emp3 = new Employee(103, "Yahyah", new Date(), 400000, comp1);
		Employee emp4 = new Employee(104, "Huzaifa", new Date(), 400000, comp1);

		session.saveOrUpdate(emp1);
		session.saveOrUpdate(emp2);
		session.saveOrUpdate(emp3);
		session.saveOrUpdate(emp4);
		tr.commit();
	}
}

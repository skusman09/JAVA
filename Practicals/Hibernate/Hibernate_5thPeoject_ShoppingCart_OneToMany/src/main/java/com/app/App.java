package com.app;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateConnection.HibernateConnection;
import cart.Address;
import cart.Cart;
import product.Product;

public class App {
	public static void main(String[] args) {
		Session session = HibernateConnection.getConnection();
		Transaction tr = session.beginTransaction();

		Address add1 = new Address("91", "India", "Maharashtra", "Mumbai");
		Address add2 = new Address("61", "Australia", "Queensland", "Brisbane");
		Address add3 = new Address("977", "Nepal", "Madhesh", "Janakpur");
		Address add4 = new Address("92", "Pakistan", "Islamabad", "Haripur");

		Product p1 = new Product("A3481", "Iphone12", "256GB-Internal, 8GB-RAM", 70000);
		Product p2 = new Product("A5893", "Iphone11", "512GB-Internal, 8GB-RAM", 60000);
		Product p3 = new Product("A6894", "Iphone14", "1TB-Internal, 12GB-RAM", 100000);
		Product p4 = new Product("A8657", "IphoneX", "128GB-Internal, 6GB-RAM", 40000);

		Set<Product> productList = new HashSet<Product>();
		Collections.addAll(productList, p1, p2, p3, p4);

		Cart cart1 = new Cart("10909710", "usman_46", "usman@46", add1, productList);

		session.saveOrUpdate(add1);
		session.saveOrUpdate(add2);
		session.saveOrUpdate(add3);
		session.saveOrUpdate(add4);

		session.saveOrUpdate(cart1);
//		session.saveOrUpdate(cart2);
//		session.saveOrUpdate(cart3);
//		session.saveOrUpdate(cart4);

		session.saveOrUpdate(p1);
		session.saveOrUpdate(p2);
		session.saveOrUpdate(p3);
		session.saveOrUpdate(p4);

		tr.commit();

	}
}

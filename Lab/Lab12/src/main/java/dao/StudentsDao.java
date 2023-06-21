package dao;

import java.util.List;

import org.hibernate.query.Query;

import hibernateUtility.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;

public class StudentsDao {

//	01. Method For Inserting Student
	public static void insertStudent(Student st) {
		// Invoking getSession() Method From HibernateUtil Class
		Session session = HibernateUtil.getSession();
		// Save Inserted Data In DB
		session.save(st);
		// commit() For Changes In DB
		Transaction tr = session.beginTransaction();
		tr.commit();
	}

//	02. Method For Get Student By ID
	public static void getStudent(int id) {
		// Invoking getSession Method From HibernateUtil Class
		Session session = HibernateUtil.getSession();
		Student stdRec = session.get(Student.class, id);
		if (stdRec != null) {
			System.out.println("\n We Found Record For ID " + "'" + id + "'" + "\n" + stdRec + "\n");
		} else {
			System.out.println("\nSorry...!\n\t Record Not Found\n");
		}
	}

//	03. Method For Delete Student By ID
	public static boolean deleteStudent(int id) {
		Session session = HibernateUtil.getSession();
		Transaction tr = session.beginTransaction();
		Student student = session.get(Student.class, id);
		if (student != null) {
			session.delete(student);
			System.out.println("Student " + id + " Deleted Successfully");
			tr.commit();
			return true;
		} else {
			System.err.println("\nStudent ID " + id + " Not Found\n");
			return false;
		}
	}

//	04. Method For Update Student By ID
	public static boolean updateStudent(Student st) {
		Session session = HibernateUtil.getSession();
		Transaction tr = session.beginTransaction();
		// Save And Update DB
		session.saveOrUpdate(st);
		tr.commit();
		return true;
	}

//	05. Method For Showing All Students Records
	@SuppressWarnings("unchecked")
	public static List<Student> allStudentRecords() {
		Session session = HibernateUtil.getSession();
		// This Is 'HQL' Query
		Query cq = session.createQuery("FROM Student");
		// list() Is Method For Return The Query Results As a List
		List<Student> list = cq.list();
		for (Student st : list) {
			System.out.println(st);
		}
		return list;
	}

//	 06. Method For Searching Student By Name
	public static List<Student> searchStudentByName(String name) {
		Session session = HibernateUtil.getSession();
		// This Is 'HQL' Query
		Query cq = session.createQuery("FROM Student WHERE sname=:abc");
		cq.setParameter("abc", name);
		// list() Is Method For Return The Query Results As a List
		List<Student> list = cq.list();
		for (Student s2 : list) {
			System.out.println(s2);
		}
		return list;
	}
}
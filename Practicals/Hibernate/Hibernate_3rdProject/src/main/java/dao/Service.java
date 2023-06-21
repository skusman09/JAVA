package dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class Service {
	public static Session getSession() {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

	public static void addRecord(Student std) {
		Session session = getSession();
		session.save(std);
		Transaction tr = session.beginTransaction();
		tr.commit();
	}

	public static void showRecords(int id) {
		Session session = getSession();
		Student stdRec = session.get(Student.class, id);
		if (stdRec != null) {
			System.out.println("\n" + stdRec + "\n");
		} else {
			System.out.println("\nSorry...!\n\t Record Not Present\n");
		}
	}

	public static void updateStudents(Student std) {
		Session session = getSession();
		session.saveOrUpdate(std);
		Transaction tr = session.beginTransaction();
		tr.commit();
	}

	public static void deleteRecord(int id) {
		Session session = getSession();
		Student student = session.get(Student.class, id);
		if (student != null) {
			session.delete(student);
			System.out.println("Student " + id + " Deleted Successfully");
		} else {
			System.err.println("\nStudent ID " + id + " Not Present\n");
		}
		Transaction tr = session.beginTransaction();
		tr.commit();
	}

	public static void showAllRecord() {
		Session session = getSession();
		Query cq = session.createQuery("FROM Student");
		List<Student> list = cq.list();
		for (Student s1 : list) {
			System.out.println(s1);
		}
	}

	public static void generateRandomSrudents() {
		Session session = getSession();

		String studentNameList[] = { "Usman", "Yahyah", "Muaviyah", "Huzaifa", "Wasi", "Waseem", "Qais", "Sufiyan" };
		String courseList[] = { "Java", "Python", "JavaScript", "Kotlin", "AWS", "Ruby" };
		String addressList[] = { "Mahim", "Bandra", "Mira Road", "Bombay", "New Mumbai" };
		int ageList[] = { 22, 21, 20, 23, 24, 25 };
		Date dateList[] = { new Date() };

		Random ran = new Random();
		for (int i = 0; i <= 20; i++) {
			int studentName = ran.nextInt(studentNameList.length);
			int courseName = ran.nextInt(courseList.length);
			int address = ran.nextInt(addressList.length);
			int age = ran.nextInt(ageList.length);
			int dates = ran.nextInt(dateList.length);

			Student st = new Student(0, studentNameList[studentName], courseList[courseName], addressList[address],
					ageList[age], dateList[dates]);
			session.saveOrUpdate(st);
		}
		Transaction tr = session.beginTransaction();
		tr.commit();
	}

	public static void deleteAllRecord() {
		Session session = getSession();
		Query cq = session.createQuery("FROM Student");
		List<Student> list = cq.list();
		for (Student s2 : list) {
			session.delete(s2);
		}
		Transaction tr = session.beginTransaction();
		tr.commit();
		System.out.println("All Students Record Are Deleted");
	}

	public static void search_In_HQL(String name) {
		Session session = getSession();
		Query cq = session.createQuery("FROM Student WHERE std_name=:abc");
		cq.setParameter("abc", name);
		List<Student> list = cq.list();
		if (name != null) {
			for (Student s2 : list) {
				System.out.println(s2);
				System.out.println("We Found Some List Of " + name);
			}
		} else {
			System.out.println(name + " Not Found");
		}

		Transaction tr = session.beginTransaction();
		tr.commit();
	}

	public static void delete_In_HQL(String crs) {
		Session session = getSession();
		Query cq = session.createQuery("FROM Student WHERE course = :abc");
		cq.setParameter("abc", crs);
//		int eu = cq.executeUpdate();
		List<Student> list = cq.list();
		if (crs != null) {
			for (Student s2 : list) {
				session.delete(s2);
				System.out.println("Deleted Successfully");
			}
		} else {
			System.out.println(crs + "\n Not Found");
		}

		Transaction tr = session.beginTransaction();
		tr.commit();
	}
}
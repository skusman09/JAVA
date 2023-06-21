package hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session getSession() {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		return session;

	}
}

package Com.tka.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction bt = session.beginTransaction();
		Candidate object = new Candidate(55, "rushi rathod", "Bjp", "Nagpur", "mh", "male", 36);

		session.update(object);
		bt.commit();
		session.close();
	}

}

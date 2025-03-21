package Com.tka.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("");
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Candidate  object = new Candidate (55,"rushi","Bjp","Nagpur", "mh","Male",36);
		session.save(object);
		tx.commit();
		session.close();
		
		
	}

}

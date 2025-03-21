package Com.tka.nov14;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Clientsaveorupdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction bs = session.beginTransaction();
		
		Candidate object = new Candidate (12,"rahul","Bjp","Nagpur","mh","male",45);
		session.saveOrUpdate(object);
		bs.commit();
		session.close();
	
	}

}

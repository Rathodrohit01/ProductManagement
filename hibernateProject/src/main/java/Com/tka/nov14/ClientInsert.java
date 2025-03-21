package Com.tka.nov14;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ClientInsert {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg2.xml");//	cfg.configure(hibernate.cfg1.xml); 
	    cfg.addAnnotatedClass(Student.class);
	    cfg.addAnnotatedClass(Address.class);
	    cfg.addAnnotatedClass(Order1.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Address add=new Address("Nagar","MH",301);
		
		Student s1=new Student(102,"Rohit",77);
		Student s2=new Student(104,"Rahul",66);
		
		Order1 o1 = new Order1("Poha",25);
		Order1 o2 = new Order1("Upama",45);
		Order1 o3 = new Order1("Coffe",15);
		Order1 o4 = new Order1("hotTea",15);
		Order1 o5 = new Order1("pav bhaji",15);
		Order1 o6 = new Order1("biryani",15);
		Order1 o7 = new Order1("shev bhaji",15);
		
		
		List<Order1> ll = new ArrayList<Order1>();
		ll.add(o1);
		ll.add(o2);
		ll.add(o3);
		ll.add(o5);
		ll.add(o6);
		ll.add(o7);
		

		
		
		s1.setAddress(add);
		s1.setOrder(ll);
		
		session.save(s1);
		tx.commit();
		session.close();
	}

}

	

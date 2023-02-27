package org.easy.hibernate;


import org.easy.hibernate.entity.HibernateUser;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

	public static void main(String[] args) throws Exception {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
								.addAnnotatedClass(HibernateUser.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			//Create object of entity class type
//			HibernateUser user = new HibernateUser("ankit21", "ankit04", "Ankit", "Mahapatra");  // Used to 'Insert' data
			HibernateUser user = new HibernateUser();
			
			//Start transaction 
			session.beginTransaction();
			
			//Perform operation
//			session.save(user);    // Used to save new entry
			user = session.get(HibernateUser.class, 3); // Used to read data
			
			//Update Operation
			user.setUsername("ankit21@gmail.com");
			
			//Delete Operation
			session.delete(user);
			
			//Commit the transaction
			session.getTransaction().commit();
			
//			System.out.println("Rows Added Successfully!!");
			System.out.println(user);
			
		} finally {
			session.close();
			factory.close();
		}
	}
}

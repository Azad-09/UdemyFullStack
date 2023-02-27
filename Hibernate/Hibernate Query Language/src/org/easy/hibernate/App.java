package org.easy.hibernate;


import java.util.List;

import org.easy.hibernate.entity.HibernateUser;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
								.addAnnotatedClass(HibernateUser.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			//Begin Transaction
			session.beginTransaction();
			// Read using HQL
//			List<HibernateUser> user = session.createQuery("from user where lastName = 'Gill'" + "OR firstName like '%z%d'").getResultList(); //Use of HQL
//			
//			for (HibernateUser temp : user) {
//				System.out.println(temp);
//			}
			
			// Update Using HQL
//			session.createQuery("update user set first_name = 'Mahendra' where user_id  = 6").executeUpdate();
			
			//Delete Using HQL
			session.createQuery("delete from user where first_name like '%z%'").executeUpdate();
			
			//commit
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}

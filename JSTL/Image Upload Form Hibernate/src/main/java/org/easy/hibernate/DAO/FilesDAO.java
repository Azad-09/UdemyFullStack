package org.easy.hibernate.DAO;

import org.easy.hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FilesDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
												.addAnnotatedClass(Files.class)
												.buildSessionFactory();
	
	public void addFileDetails(Files file) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(file);
		session.getTransaction().commit();
		System.out.println(file.getFileName()+ " got added!!");
	}
	
	
}

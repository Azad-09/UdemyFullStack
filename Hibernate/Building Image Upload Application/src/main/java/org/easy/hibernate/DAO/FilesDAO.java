package org.easy.hibernate.DAO;

import java.util.List;

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
	
	public List<Files> listFiles() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Files> files = session.createQuery("from file").getResultList();
//		session.getTransaction().commit();
		return files;
	}

	public void updateInformation(int id, String label, String caption) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Files file = session.get(Files.class, id );
		file.setLabel(label);
		file.setCaption(caption);
		session.getTransaction().commit();
		
	}

	public Files getFile(int fileId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Files file =  session.get(Files.class, fileId);
		session.getTransaction().commit();
		return file;
	}

	public void deleteFiles(int fileId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Files file = session.get(Files.class, fileId);
		session.delete(file);
		session.getTransaction().commit();	
	}

	
	
	
}

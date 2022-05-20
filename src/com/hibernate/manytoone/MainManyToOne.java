package com.hibernate.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainManyToOne {
	public static void main(String[] args) {
		Class science = new Class();
		science.setClassName("Science");
		science.setMaxStudents(50);
		
		Students sahan = new Students();
		sahan.setName("Sahan Perera");
		sahan.setAddress("Galle");
		sahan.setContactNo("0703378737");
		sahan.setStudentClass(science);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		session.save(science);
		session.save(sahan);		
		session.getTransaction().commit();
		session.close();
	}

}

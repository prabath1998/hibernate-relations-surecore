package com.hibernate.manytomany2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainManyToMany2 {
	public static void main(String[] args) {
		Author tom = new Author();
		tom.setName("tom curren");
		tom.setContactNo("0112365981");
		
		Author alex = new Author();
		alex.setName("alex hales");
		alex.setContactNo("0112365981");
		
		Books b1 = new Books();
		b1.setName("Java Essentials");
		b1.setIsbn("00015896521");
		b1.getAuthors().add(tom);
		b1.getAuthors().add(alex);
		
		Books b2 = new Books();
		b2.setName("Dart Essentials");
		b2.setIsbn("215454500001");
		b2.getAuthors().add(tom);
		
		tom.getBooks().add(b1);
		tom.getBooks().add(b2);
		alex.getBooks().add(b1);
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
//		session.save(tom);
//		session.save(alex);
//		session.save(b1);
//		session.save(b2);
		
		Author a = session.get(Author.class, 1L);
		System.out.println(a.getBooks().size());	
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(a.getName());
//
//		List<Books> books = a.getBooks();
//		for(Books book:books) {
//			System.out.println(book.getAuthors());
//		}	
		
	}

}

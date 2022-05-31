package com.hibernate.manytoone2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainManyToMany2 {
	
	public static void main(String[] args) {
		
		Car subaru = new Car();
		subaru.setMake("Casper");
		subaru.setModel("Racer");
		
		Driver tom = new Driver();
		tom.setName("tom david");
		tom.setContactNo("0778565987");
		tom.setCar(subaru);
		
		Driver alex = new Driver();
		alex.setName("alex hales");
		alex.setContactNo("0112365874");
		alex.setCar(subaru);
		
		subaru.getDriver().add(alex);
		subaru.getDriver().add(tom);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
//		session.save(subaru);
//		session.save(tom);
//		session.save(alex);			
//		
		Driver d = session.get(Driver.class, 3L);
		System.out.println(d);
		
		Car c =  session.get(Car.class, 1L);
		System.out.println(c);
		
		
		session.getTransaction().commit();
		session.close();
	}


}

package com.hibernate.tablegen;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TableGenMain {
	public static void main(String[] args) {
		
		
		Cars car = new Cars();
		car.setModel("toyota");
		car.setMake("corolla");
		
		Animal animal = new Animal();
		animal.setName("Kitty");
		animal.setAge(6);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		session.save(car);
		session.save(animal);
//		session.save(bank);
		
		//Read data with hibernate
//		Bank b = session.get(Bank.class, 2);
//		System.out.println(b.getManager().getName());
//		
//		Manager m = session.get(Manager.class, 1);
//		System.out.println(m.getBank().getDescription());
		
		session.getTransaction().commit();
		session.close();
	}

}

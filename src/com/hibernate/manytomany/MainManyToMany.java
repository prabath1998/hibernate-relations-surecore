package com.hibernate.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainManyToMany {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.setDestination("Colombo");
		bus1.setRegNumber("NB-3565");
		bus1.setSource("Galle");
		bus1.setTotalSeats(54);
		
		Passenger kamal = new Passenger();
		kamal.setAddress("Matara");
		kamal.setContactNo("0703378737");
		kamal.setName("Kamal nishantha");
		kamal.getBus().add(bus1);
		
		Passenger nimal = new Passenger();
		nimal.setAddress("Negombo");
		nimal.setContactNo("0712265981");
		nimal.setName("Nimal jayantha");
		nimal.getBus().add(bus1);
		
		bus1.getPassengers().add(nimal);
		bus1.getPassengers().add(kamal);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		session.save(bus1);
		session.save(nimal);
		session.save(kamal);
		session.getTransaction().commit();
		session.close();
	}
	

}

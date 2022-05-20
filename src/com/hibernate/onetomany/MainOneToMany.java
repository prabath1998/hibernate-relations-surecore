package com.hibernate.onetomany;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainOneToMany {
	public static void main(String[] args) {
		
		Banks bank = new Banks();
		bank.setCode("3366");
		bank.setDescription("Bank of Ceylon");
		bank.setStatus("Active");
		
		Branch branch = new Branch();
		branch.setCity("Galle");
		branch.setCode("3366");
		branch.setBank(bank);
		branch.setStatus("Active");
		
		Branch branch1 = new Branch();
		branch1.setCity("Matara");
		branch1.setCode("3366");
		branch1.setBank(bank);
		branch1.setStatus("Deactive");
		
		bank.getBranch().add(branch);	
		bank.getBranch().add(branch1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		session.save(bank);
		session.save(branch);
		session.save(branch1);
		session.getTransaction().commit();
		session.close();
	}
}

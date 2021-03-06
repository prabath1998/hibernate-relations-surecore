package com.hibernate.main;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Bank;
import com.hibernate.domain.Book;
import com.hibernate.domain.Manager;
import com.hibernate.domain.ParentsName;
import com.hibernate.domain.Student;
import com.hibernate.domain.Teacher;
import com.hibernate.domain.TeacherName;

public class HibernateMain {
	public static void main(String[] args) {
//		Student s = new Student();
//		s.setFirstName("kasun");
//		s.setLastname("dias");
//		s.setContactNo("0774521365");
//		s.setAddress("Galle");
//		s.setDob("2001.25.36");
//		
//		Book b = new Book();
//		b.setName("Java fundementals");
//		b.setIsbn("sdfs4544");
//		b.setAuthor("Akila Delapalage");
//		b.setStudent(s);		
		
//		Manager manager = new Manager();
//		manager.setName("Tim David");
//		manager.setContactno("0778569587");
//		manager.setDob("1988.12.5");
//		
//		Bank bank = new Bank();
//		bank.setCode("5566");
//		bank.setDescription("Commercial Bank");
//		bank.setStatus("active");
//		bank.setManager(manager);
		
//		manager.setBank(bank);
		
		TeacherName name = new TeacherName();
		name.setFname("kasun");
		name.setMname("madushan");
		name.setLname("de silva");
		
		TeacherName parName = new TeacherName();
		parName.setFname("nirosha");
		parName.setMname("de silva");
		parName.setLname("K.S");
		
		
//		ParentsName p = new ParentsName();
//		p.setParentFname("jayani");
//		p.setParentMname("de silva");
//		p.setParentInitials("N.C");
		
		Teacher t = new Teacher();
		t.setContactNo("0000000000");
		t.setDob("2001.8.25");
		t.setName(name);
		t.setParentName(parName);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		session.save(t);
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

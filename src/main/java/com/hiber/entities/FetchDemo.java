package com.hiber.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		// get and load
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//get-student:2
		//Students studentsByid = (Students) session.get(Students.class, 5);
		//System.out.println(studentsByid);//null because object is not found in the database
		
		
//		Students studentsByid = (Students) session.get(Students.class, 2);
//		System.out.println(studentsByid);
		
		
		//load() method is also used as the same way as the get() method is used
		Students studentsByid = (Students) session.load(Students.class, 2);
		Students studentsByid2 = (Students) session.load(Students.class, 7);
		
		System.out.println(studentsByid.getName());
		//System.out.println(studentsByid);
		
//		Address address=session.get(Address.class, 2);
//		System.out.println("street : " +address.getCity());
//		
//		Address address1=session.get(Address.class, 2);
//		System.out.println("street : " +address1.getCity());
		
		
		
		//transaction is not required because transaction is required only when we have to save the data
		session.close();
		factory.close();
	}

}

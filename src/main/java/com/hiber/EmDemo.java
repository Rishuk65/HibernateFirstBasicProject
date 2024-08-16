package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.entities.Certificates;
import com.hiber.entities.Students;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//Students objects
		Students std1= new Students();
		std1.setSid(14234);
		std1.setName("Ankit Tiwari");
		std1.setCity("lucknow");
		
		Students std2=new Students(1212, "Ravi Tiwari", "Delhi");
		
		//Certificates objects
		
		Certificates certificate=new Certificates();
		certificate.setCourse("Android");
		certificate.setDuration("2 months");
		
		Certificates certificate1=new Certificates("Hibernate", "1.5 months");
		
		
		//embeding certificate object into student
		std1.setCerti(certificate);
		std2.setCerti(certificate1);
	   session.save(std1);
	   session.save(std2);
	     transaction.commit();
		session.close();
		factory.close();

	}

}

package com.hiber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import com.hiber.entities.Address;
import com.hiber.entities.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started!" );
        Configuration cfg =new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        //creating students
//        Students s1=new Students(101, "Gaurav Mishra", "Motihari");
//        Students s2=new Students(102, "Rishi Prabh Mishra", "MadhuBani");
//        Students s3=new Students(103, "Amitesh kumar", "Patna");
//        s1.setName("Sheshank");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
        
        //creating Address
        
        Address ad= new Address();
        ad.setStreet("street2");
        ad.setCity("Patna");
        ad.setIsOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.4);
       ad.setO_time(new Date());
       ad.setC_time(new Date());
        System.out.println(ad);
       //Reading image 
        
//       FileInputStream fis= new FileInputStream("src/main/java/myflag.png");
//       byte[] data=new byte[fis.available()];
//       fis.read(data);
//       ad.setImage(data);
       
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
//        session.save(s1);
//        session.save(s2);
//        session.save(s3);
        session.save(ad);
        transaction.commit();
        System.out.println(sessionFactory.isOpen());
        session.close();
        sessionFactory.close();
        Boolean b=sessionFactory.isOpen();
        TransactionStatus status = transaction.getStatus();
        boolean t = transaction.isActive();
        System.out.println(t);//false
        System.out.println(b);//false
        System.out.println(status);//committed
        
        System.out.println("done....");
        
        
        
        
    }
}

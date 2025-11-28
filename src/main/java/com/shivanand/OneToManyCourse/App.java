package com.shivanand.OneToManyCourse;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	Course course1 = new Course("Java");
    	Course course2 = new Course("HTML");
    	Course course3 = new Course("CSS");
    	Course course4 = new Course("MySQL");
    	
    	kodStudent student1 = new kodStudent("omkar", "omkar@gmail.com",819710);
    	
    	ArrayList<Course> al = new ArrayList<Course>();
    	al.add(course1);
    	al.add(course2);
    	al.add(course3);
    	al.add(course4);
    	
    	student1.setCourse(al);
    	
    	course1.setStudent(student1);
    	course2.setStudent(student1);
    	course3.setStudent(student1);
    	course4.setStudent(student1);
    	
    	Configuration configuration = new Configuration().configure("hiberante.cfg.xml");
    	SessionFactory factory = configuration.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();

    	session.persist(student1);
    	transaction.commit();
    	session.close();
    	factory.close();
    }
}

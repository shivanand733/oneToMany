package com.shivanand.OneToManyCourse;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Choice any 4 Courses");
    	Course course1 = new Course(scan.next());
    	Course course2 = new Course(scan.next());
    	Course course3 = new Course(scan.next());
    	Course course4 = new Course(scan.next());
    	
    	System.out.println("Enete name, Email, Phone");
    	kodStudent student1 = new kodStudent(scan.next(), scan.next(),scan.nextInt());
    	
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

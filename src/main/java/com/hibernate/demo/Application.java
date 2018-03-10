package com.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author obj1= new Author();
        obj1.setId(12);
        obj1.setFname("ABC");
        obj1.setLname("XYZ");
        Calendar cal1= Calendar.getInstance();
        cal1.set(1998,01,01);
        obj1.setDate(cal1);
        Book book1= new Book();
        book1.setId(108);
        book1.setBname("INTRO TO DATA STRUCTURES AND ALGO");
        session.save(book1);
        Book book2= new Book();
        book2.setId(109);
        book2.setBname("OPERATING SYSTEMS");
        session.save(book2);
        obj1.getBook().add(book1);
        obj1.getBook().add(book2);
        Address add1= new Address();
        add1.setStreet("123");
        add1.setLocation("BAREILLY");
        add1.setState("UP");
        obj1.setAddress(add1);
        List<String> list1= new ArrayList<>();
        list1.add("PHYSICS");
        list1.add("CHEMISTRY");
        obj1.setSubjects(list1);
        session.save(obj1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("File Executed");
    }
}
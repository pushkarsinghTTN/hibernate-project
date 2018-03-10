package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Application{
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author obj1= session.get(Author.class,10);
        Book book1= new Book();
        book1.setId(101);
        book1.setBname("INTRO TO ALGO");
        session.save(book1);
        obj1.setBook(book1);
        session.save(obj1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("File Executed");
    }
}
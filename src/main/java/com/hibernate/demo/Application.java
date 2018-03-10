package com.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Author obj1= new Author();
        obj1.setId(3);
        obj1.setFname("Shreyansh");
        obj1.setLname("Sahu");
        obj1.setAge(21);
        Calendar cal1= Calendar.getInstance();
        cal1.set(1996,7,15);
        obj1.setDate(cal1);
        session.save(obj1);

        Author obj2= new Author();
        obj2.setId(4);
        obj2.setFname("Swapnil");
        obj2.setLname("Khanna");
        obj2.setAge(22);
        Calendar cal2= Calendar.getInstance();
        cal2.set(1995,6,3);
        obj2.setDate(cal2);
        session.save(obj2);

        Author obj3= new Author();
        obj3.setId(5);
        obj3.setFname("Payal");
        obj3.setLname("Nigam");
        obj3.setAge(21);
        Calendar cal3= Calendar.getInstance();
        cal3.set(1996,12,18);
        obj3.setDate(cal3);
        session.save(obj3);

        Author obj4= new Author();
        obj4.setId(6);
        obj4.setFname("Himanshi");
        obj4.setLname("Singh");
        obj4.setAge(23);
        Calendar cal4= Calendar.getInstance();
        cal4.set(1996,8,15);
        obj4.setDate(cal4);
        session.save(obj4);
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("File Executed");
    }
}
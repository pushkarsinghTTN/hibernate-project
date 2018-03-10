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
        Author obj1=new Author();
        obj1.setId(10);
        obj1.setFname("Neelesh");
        obj1.setLname("Bansal");
        Calendar cal1= Calendar.getInstance();
        cal1.set(1996,07,27);
        obj1.setDate(cal1);
        Address address1 = new Address();
        address1.setStreet("ABCD");
        address1.setLocation("NOIDA");
        address1.setState("UTTAR PRADESH");
        obj1.setAddress(address1);
        session.save(obj1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("File Executed");
    }
}
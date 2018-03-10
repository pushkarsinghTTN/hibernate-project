package com.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //Create
        Author auth1 = new Author();
        auth1.setId(1);
        auth1.setFname("Pushkar");
        auth1.setLname("Singh");
        auth1.setAge(23);
        session.save(auth1);
        //Create
        Author auth2 = new Author();
        auth2.setId(2);
        auth2.setFname("Archit");
        auth2.setLname("Chauhan");
        auth2.setAge(22);
        session.save(auth2);
        //Create
        Author auth3 = new Author();
        auth3.setId(3);
        auth3.setFname("Swapnil");
        auth3.setLname("Khanna");
        auth3.setAge(22);
        session.save(auth3);

        //Read
        Author obj1= session.get(Author.class,1);
        System.out.println(obj1);

        //Update
        Author obj2= session.get(Author.class,2);
        obj2.setAge(24);
        session.update(obj2);

        //Delete
        Author obj3= session.get(Author.class,3);
        session.delete(obj3);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("File Executed");

    }
}
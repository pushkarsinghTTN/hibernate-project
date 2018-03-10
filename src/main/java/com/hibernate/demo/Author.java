package com.hibernate.demo;
import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Author{
    @Id
    private Integer id;
    @Column(name="firstname")
    private String fname;
    @Column(name="lastname")
    private String lname;
    @Column(name="auth_age")
    private Integer age;
    @Column(name="DOB")
    private Calendar date;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Calendar getDate() {
        return date;
    }
    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}